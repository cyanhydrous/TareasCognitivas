/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Negocio.estimulos;
import Modelos.*;
import DAO.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/**
 *
 * @author Joshua
 */
public class GridPar extends javax.swing.JFrame {
    estimulos e = new estimulos();
double inicio,fin;

    /**
     * Creates new form inicio
     */
    public GridPar() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.cuadrantes();

    }

    public String siguiente(){
        String a[]={"Cuadrante1tf","Cuadrante2tf"};
        if(Cuadrante1tf.getText()!=""){
            return a[1];
        }
        else{
            return a[0];
        }
        
    }
    //
    ///
    // aqui es lo que necesito ver para que puedan hacer la rotacion
    //
    //
    public void cuadrantes() {
        String c = e.Cadena();
        
        
        
        
        if (EsPar(c)) {
            inicio= System.currentTimeMillis();
            Cuadrante1tf.setText(c);
        } else {
            
            Cuadrante2tf.setText(c);
        }

    }
////    

    public boolean EsPar(String cadena) {
        int num = Integer.parseInt(cadena.substring(1));
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
//    
//    public Boolean Incorrecto(){
//        
//    }

//    public void IteraTAreas(){
//        d.getTime();
//        Cuadrante1tf.setText(e.Cadena());
//        
//        Cuadrante2tf.setText(CuadranteSiguiente());
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cuadrante1tf = new javax.swing.JTextField();
        Cuadrante2tf = new javax.swing.JTextField();
        Correctorlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        Cuadrante1tf.setEditable(false);
        Cuadrante1tf.setBackground(java.awt.Color.white);
        Cuadrante1tf.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Cuadrante1tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cuadrante1tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cuadrante1tfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cuadrante1tfKeyReleased(evt);
            }
        });

        Cuadrante2tf.setEditable(false);
        Cuadrante2tf.setBackground(java.awt.Color.white);
        Cuadrante2tf.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Cuadrante2tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cuadrante2tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cuadrante2tfActionPerformed(evt);
            }
        });
        Cuadrante2tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cuadrante2tfKeyReleased(evt);
            }
        });

        Correctorlbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Correctorlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Correctorlbl.setText("asdasdas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Cuadrante1tf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cuadrante2tf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Correctorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cuadrante2tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuadrante1tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(Correctorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cuadrante1tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cuadrante1tfKeyPressed

    }//GEN-LAST:event_Cuadrante1tfKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void Cuadrante2tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cuadrante2tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cuadrante2tfActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void Cuadrante2tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cuadrante2tfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_M) {
            // validar si es impar
            if (Cuadrante1tf.getText() == "") {
                              
                
                Correctorlbl.setText("Incorrecto");
                this.cuadrantes();
                Correctorlbl.setText("");
                Cuadrante1tf.setText("");
                fin=System.currentTimeMillis();
            } else {
                Correctorlbl.setText("correcto");
                this.cuadrantes();
                Correctorlbl.setText("");
                Cuadrante1tf.setText("");

            }
        }
    }//GEN-LAST:event_Cuadrante2tfKeyReleased

    private void Cuadrante1tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cuadrante1tfKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_N) {
            // validar si es par

            if (Cuadrante2tf.getText() == "") {
                Correctorlbl.setText("Incorrecto");
                this.cuadrantes();
                Cuadrante2tf.setText("");
                Correctorlbl.setText("");
               
            } else {
                Correctorlbl.setText("correcto");
                this.cuadrantes();
                Cuadrante2tf.setText("");
                Correctorlbl.setText("");
            }

        }
    }//GEN-LAST:event_Cuadrante1tfKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correctorlbl;
    private javax.swing.JTextField Cuadrante1tf;
    private javax.swing.JTextField Cuadrante2tf;
    // End of variables declaration//GEN-END:variables
}
