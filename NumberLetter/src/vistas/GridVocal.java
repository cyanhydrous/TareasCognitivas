/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Negocio.estimulos;
import Modelos.*;
import DAO.*;
import java.awt.event.KeyEvent;
import java.util.Date;

/**
 *
 * @author Joshua
 */
public class GridVocal extends javax.swing.JFrame {

    estimulos e = new estimulos();
    Thread t = new Thread();
    Date d = new Date();
    long desde,hasta,ms;
    
    /**
     * Creates new form inicio
     */
    public GridVocal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        desde =System.currentTimeMillis();
        cuadrantes();
        
        Correctorlbl.setText("");
//        if(Incorrecto()){
//            Correctorlbl.setText("Incorrecto");
//        }

    }

    
    public void cuadrantes(){
        
        String c = e.Cadena();
        if(EsVocal(c)){
            Cuadrante4tf.setText(c);
        }
        else{
            Cuadrante3tf.setText(c);
        }
    }
////    
    public boolean EsVocal(String cadena){
        String s= cadena.substring(0);
        String v[]={"A","E","I","O","U"};
        
        for(int i=0;i<v.length;i++){
            if(v[i].equals(s)){
                return true;
            }
            else return false;
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

        Cuadrante4tf = new javax.swing.JTextField();
        Cuadrante3tf = new javax.swing.JTextField();
        Correctorlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        Cuadrante4tf.setEditable(false);
        Cuadrante4tf.setBackground(java.awt.Color.white);
        Cuadrante4tf.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Cuadrante4tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Cuadrante3tf.setEditable(false);
        Cuadrante3tf.setBackground(java.awt.Color.white);
        Cuadrante3tf.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Cuadrante3tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                        .addGap(46, 46, 46)
                        .addComponent(Cuadrante4tf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cuadrante3tf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Correctorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cuadrante3tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuadrante4tf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(Correctorlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       if(evt.getKeyCode()==evt.VK_Z){
                if(Cuadrante4tf.getText()==""){
                    Correctorlbl.setText("Incorrecto");
                }
                else{
                    cuadrantes();
                   hasta= System.currentTimeMillis();
                   ms+=(hasta-desde);
                }
  
        }else if(evt.getExtendedKeyCode()==evt.VK_X){
                if(Cuadrante3tf.getText()==""){
                    Correctorlbl.setText("Incorrecto");
                }
        
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correctorlbl;
    private javax.swing.JTextField Cuadrante3tf;
    private javax.swing.JTextField Cuadrante4tf;
    // End of variables declaration//GEN-END:variables
}
