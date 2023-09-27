/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversidadEjemplo.Vistas;

import UniversidadEjemplo.AccesoADatos.AlumnoData;
import UniversidadEjemplo.AccesoADatos.InscripcionData;
import UniversidadEjemplo.AccesoADatos.MateriaData;
import UniversidadEjemplo.Entidades.Alumno;
import UniversidadEjemplo.Entidades.Inscripcion;
import UniversidadEjemplo.Entidades.Materia;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elmsn
 */
public class GestionDeNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form GestionDeNotas
     */
    public GestionDeNotas() {
        initComponents();
        armarCabecera();
        cargarbox();
        this.setTitle("Carga de notas");
    }
    private List<Inscripcion> inscdelAlmno = new List<Inscripcion>() {
        @Override
        public int size() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isEmpty() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Iterator<Inscripcion> iterator() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <T> T[] toArray(T[] a) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean add(Inscripcion e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean addAll(Collection<? extends Inscripcion> c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean addAll(int index, Collection<? extends Inscripcion> c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Inscripcion get(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Inscripcion set(int index, Inscripcion element) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void add(int index, Inscripcion element) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Inscripcion remove(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int indexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int lastIndexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public ListIterator<Inscripcion> listIterator() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public ListIterator<Inscripcion> listIterator(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Inscripcion> subList(int fromIndex, int toIndex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setText("Carga de notas");

        jLabel2.setText("Seleccione un Alumno:");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(217, 217, 217)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(jLabel2)
                            .addGap(33, 33, 33)
                            .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jbGuardar)
                        .addGap(102, 102, 102)
                        .addComponent(jbSalir)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
     
        InscripcionData inscripcionD = new InscripcionData();
        Alumno alumno = (Alumno) jcbAlumno.getSelectedItem();

        modelo.setRowCount(0);
        try {
            inscdelAlmno= inscripcionD.obtenerInscripcionesPorAlumno(alumno.getIdAlumno());
            
                for (Inscripcion inscripcion : inscdelAlmno) {
                modelo.addRow(new Object[]{
                    inscripcion.getIdInscripcion(),
                    inscripcion.getMateria().getNombre(),
                    inscripcion.getNota()
                });
            }

        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Formato incorrecto");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

//        try{
//        InscripcionData inscripcionData = new InscripcionData();
//        
//       // int filaSeleccionada = jTable1.getSelectedRow();
//            for (int i = 0; i <modelo.getRowCount(); i++) {
//                
//            
//        
//        int idInscripcion = (Integer) modelo.getValueAt(i, 0);
//       
//        String notaSelec = (String) modelo.getValueAt(i, 2);
//        int notaSelec1 = Integer.parseInt(notaSelec);
//
////        MateriaData materiaData = new MateriaData();
////        // tengo que buscar id de inscripcion por materia??
//        
//        for (Inscripcion inscripcionnueva : inscdelAlmno) {
//            if (inscripcionnueva.getIdInscripcion()==idInscripcion && inscripcionnueva.getNota()!=notaSelec1) {
//
//                inscripcionnueva.setNota(notaSelec1);
//               
//                inscripcionData.actualizarInscripcion(inscripcionnueva);
//            }
//        }
//            }
//    
//    }catch(NumberFormatException nfe){
//        JOptionPane.showMessageDialog(this, "Formato incorrecto" + nfe);
//    }catch (Exception e){
//       // JOptionPane.showMessageDialog(this, "Modifique la nota antes de guardar ");
//    }
         try {
        InscripcionData inscripcionData = new InscripcionData();
        int[] filasSeleccionadas = jTable1.getSelectedRows();

        if (filasSeleccionadas.length > 0) {
            for (int fila : filasSeleccionadas) {
                int idInscripcion = (Integer) modelo.getValueAt(fila, 0);
                String notaSelec = (String) modelo.getValueAt(fila, 2);

                if (esNotaValida(notaSelec)) {
                    int notaSelec1 = Integer.parseInt(notaSelec);

                    for (Inscripcion inscripcionNueva : inscdelAlmno) {
                        if (inscripcionNueva.getIdInscripcion() == idInscripcion) {
                            inscripcionNueva.setNota(notaSelec1);
                            inscripcionData.actualizarInscripcion(inscripcionNueva);
                            break; // Salir del bucle una vez que se haya actualizado una fila
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Formato de nota incorrecto en la fila " + (fila + 1) + ". Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            JOptionPane.showMessageDialog(this, "Notas actualizadas con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione al menos una fila para cambiar la nota.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar las notas. Modifique la nota antes de guardar.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        modelo.addColumn("IdInscripcion");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");

        jTable1.setModel(modelo);
    }

    private void cargarbox() {

        AlumnoData alumd = new AlumnoData();
        List<Alumno> Alumnos = alumd.listarAlumnos();
        jcbAlumno.removeAllItems();
        for (int i = 0; i < Alumnos.size(); i++) {
            jcbAlumno.addItem(Alumnos.get(i));
        }
    }
private boolean esNotaValida(String nota) {
    try {
        int notaValue = Integer.parseInt(nota);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }

}
}
