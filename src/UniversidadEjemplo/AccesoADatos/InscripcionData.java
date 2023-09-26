package UniversidadEjemplo.AccesoADatos;

import UniversidadEjemplo.Entidades.Alumno;
import UniversidadEjemplo.Entidades.Inscripcion;
import UniversidadEjemplo.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;
    private MateriaData materiaData = new MateriaData();
    private AlumnoData alumnoData = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO `inscripcion`( `nota`, `idAlumno`, `idMateria`) "
                + "VALUES (?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, (int) insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion añadida con exito ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
//consultar si se puede guardar asi la inscripcion
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Inscripcion inscripcion = new Inscripcion();

                Alumno alumno = alumnoData.buscarAlumno(rs.getInt("idAlumno"));

                Materia materia = materiaData.buscarMateria(rs.getInt("IdMateria"));

                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getInt("nota"));

                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE inscripcion.idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                Alumno alumno = new Alumno();
                Materia materia = new Materia();
                alumno = alumnoData.buscarAlumno(id);
                materia = materiaData.buscarMateria(rs.getInt("IdMateria"));
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setAlumno(alumno);
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            String sql = "SELECT inscripcion.idMateria, `nombre`, `año` FROM `inscripcion`, materia "
                    + "WHERE inscripcion.idMateria =materia.idMateria and inscripcion.idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones " + ex.getMessage());
        }
        return materias;
    }

    // Revisar
    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materiasNO = new ArrayList<Materia>();
        try {
//            String sql = "SELECT inscripcion.idMateria, `nombre`, `año` FROM `inscripcion`, materia "
//                    + "WHERE  NOT  inscripcion.idMateria =materia.idMateria and inscripcion.idAlumno = ?";
            String sql = "SELECT m.idMateria, m.nombre, m.año"
                    + " FROM materia m "
                    + " LEFT JOIN inscripcion i ON m.idMateria = i.idMateria AND i.idAlumno = ?"
                    + " WHERE i.idMateria IS NULL";

            // Where not in 
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt(1));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materiasNO.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones materias NO cursadas " + ex.getMessage());
        }

        return materiasNO;
    }

    public void eliminarInscripcion(Inscripcion insc) {
        String sql = " DELETE FROM `inscripcion` WHERE idAlumno=? AND IdMateria= ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, (int) insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                //  insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion Eliminada con exito ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Inscripcion> obtenerInscripcionesPorMateria(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE inscripcion.IdMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                Alumno alumno = new Alumno();
                Materia materia = new Materia();
                alumno = alumnoData.buscarAlumno(rs.getInt("idAlumno"));
                materia = materiaData.buscarMateria(id);
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setAlumno(alumno);
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
        return inscripciones;
    }

    public void actualizarInscripcion(Inscripcion inscripcion) {
        String sql = "UPDATE `inscripcion` SET `nota`=?,`idAlumno`=?,`IdMateria`=? WHERE `idInscripcion`=?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.setInt(4, inscripcion.getIdInscripcion());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "La Inscripcion no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());

        }

    }
}
