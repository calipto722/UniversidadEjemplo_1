/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversidadEjemplo.Entidades;

import UniversidadEjemplo.AccesoADatos.AlumnoData;
import UniversidadEjemplo.AccesoADatos.Conexion;
import UniversidadEjemplo.AccesoADatos.UsuarioData;
import UniversidadEjemplo.Vistas.MenuPrincipal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author noelia
 */
public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion.getConexion();
//        Alumno alum = new Alumno(234, "oap", "mf", LocalDate.of(2022, Month.MARCH, 12), false);
//        AlumnoData alumd=new AlumnoData();
//        alumd.guardarAlumno(alum);
        
       Usuario usuario =new Usuario("calipto", "calipto722@gmail.com",1);
        UsuarioData usuariodata= new UsuarioData();
        usuariodata.verificarUsuario(usuario.getNombre());
        String pas = "calipto722@gmail.com";
        usuariodata.verificarPasswor(usuario, pas);
        
    }
    
}
