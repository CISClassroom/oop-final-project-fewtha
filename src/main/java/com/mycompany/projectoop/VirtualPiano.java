/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectoop;

import java.awt.event.KeyEvent;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Fuse TP
 */

 
public class VirtualPiano extends javax.swing.JFrame {

    /**
     * Creates new form VirtualPiano
     */
   
    public VirtualPiano() {
        initComponents();
        
    }
     // constructor

    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbCs = new javax.swing.JButton();
        jbC = new javax.swing.JButton();
        jbDs = new javax.swing.JButton();
        jbD = new javax.swing.JButton();
        jbE = new javax.swing.JButton();
        jbFs = new javax.swing.JButton();
        jbF = new javax.swing.JButton();
        jbGs = new javax.swing.JButton();
        jbG = new javax.swing.JButton();
        jbBb = new javax.swing.JButton();
        jbA = new javax.swing.JButton();
        jbB = new javax.swing.JButton();
        jbCs1 = new javax.swing.JButton();
        jbDs1 = new javax.swing.JButton();
        jbF1 = new javax.swing.JButton();
        jbD1 = new javax.swing.JButton();
        jbC1 = new javax.swing.JButton();
        jbE1 = new javax.swing.JButton();
        jchkSteel = new javax.swing.JCheckBox();
        jchkMusic = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        D = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        F = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jbCs.setBackground(new java.awt.Color(0, 0, 0));
        jbCs.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbCs.setForeground(java.awt.Color.lightGray);
        jbCs.setText("C#");
        jbCs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCsActionPerformed(evt);
            }
        });
        jPanel1.add(jbCs);
        jbCs.setBounds(60, 210, 80, 240);

        jbC.setBackground(java.awt.Color.white);
        jbC.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbC.setText("C");
        jbC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCActionPerformed(evt);
            }
        });
        jbC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCKeyPressed(evt);
            }
        });
        jPanel1.add(jbC);
        jbC.setBounds(10, 210, 80, 420);

        jbDs.setBackground(java.awt.Color.black);
        jbDs.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbDs.setForeground(java.awt.Color.lightGray);
        jbDs.setText("D#");
        jbDs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbDs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDsActionPerformed(evt);
            }
        });
        jPanel1.add(jbDs);
        jbDs.setBounds(160, 210, 80, 240);

        jbD.setBackground(java.awt.Color.white);
        jbD.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbD.setText("D");
        jbD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDActionPerformed(evt);
            }
        });
        jbD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbDKeyPressed(evt);
            }
        });
        jPanel1.add(jbD);
        jbD.setBounds(110, 210, 80, 420);

        jbE.setBackground(java.awt.Color.white);
        jbE.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbE.setText("E");
        jbE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEActionPerformed(evt);
            }
        });
        jPanel1.add(jbE);
        jbE.setBounds(210, 210, 80, 420);

        jbFs.setBackground(java.awt.Color.black);
        jbFs.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbFs.setForeground(java.awt.Color.lightGray);
        jbFs.setText("F#");
        jbFs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbFs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFsActionPerformed(evt);
            }
        });
        jPanel1.add(jbFs);
        jbFs.setBounds(360, 210, 80, 240);

        jbF.setBackground(java.awt.Color.white);
        jbF.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbF.setText("F");
        jbF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFActionPerformed(evt);
            }
        });
        jPanel1.add(jbF);
        jbF.setBounds(310, 210, 80, 420);

        jbGs.setBackground(java.awt.Color.black);
        jbGs.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbGs.setForeground(java.awt.Color.lightGray);
        jbGs.setText("G#");
        jbGs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbGs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGsActionPerformed(evt);
            }
        });
        jPanel1.add(jbGs);
        jbGs.setBounds(460, 210, 80, 240);

        jbG.setBackground(java.awt.Color.white);
        jbG.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbG.setText("G");
        jbG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGActionPerformed(evt);
            }
        });
        jPanel1.add(jbG);
        jbG.setBounds(400, 210, 80, 420);

        jbBb.setBackground(java.awt.Color.black);
        jbBb.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbBb.setForeground(java.awt.Color.lightGray);
        jbBb.setText("Bb");
        jbBb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbBb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBbActionPerformed(evt);
            }
        });
        jPanel1.add(jbBb);
        jbBb.setBounds(560, 210, 80, 240);

        jbA.setBackground(java.awt.Color.white);
        jbA.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbA.setText("A");
        jbA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAActionPerformed(evt);
            }
        });
        jPanel1.add(jbA);
        jbA.setBounds(510, 210, 80, 420);

        jbB.setBackground(java.awt.Color.white);
        jbB.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbB.setText("B");
        jbB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBActionPerformed(evt);
            }
        });
        jPanel1.add(jbB);
        jbB.setBounds(610, 210, 80, 420);

        jbCs1.setBackground(java.awt.Color.black);
        jbCs1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbCs1.setForeground(java.awt.Color.lightGray);
        jbCs1.setText("C#1");
        jbCs1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbCs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCs1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbCs1);
        jbCs1.setBounds(760, 210, 80, 240);

        jbDs1.setBackground(java.awt.Color.black);
        jbDs1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbDs1.setForeground(java.awt.Color.lightGray);
        jbDs1.setText("D#1");
        jbDs1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbDs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDs1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbDs1);
        jbDs1.setBounds(860, 210, 80, 240);

        jbF1.setBackground(java.awt.Color.white);
        jbF1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbF1.setText("F1");
        jbF1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbF1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbF1);
        jbF1.setBounds(990, 210, 80, 420);

        jbD1.setBackground(java.awt.Color.white);
        jbD1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbD1.setText("D");
        jbD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbD1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbD1);
        jbD1.setBounds(810, 210, 80, 420);

        jbC1.setBackground(java.awt.Color.white);
        jbC1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbC1.setText("C");
        jbC1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbC1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbC1);
        jbC1.setBounds(710, 210, 80, 420);

        jbE1.setBackground(java.awt.Color.white);
        jbE1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jbE1.setText("E1");
        jbE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbE1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbE1);
        jbE1.setBounds(900, 210, 80, 420);

        jchkSteel.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jchkSteel.setText("Steel Drum");
        jPanel1.add(jchkSteel);
        jchkSteel.setBounds(640, 150, 180, 40);

        jchkMusic.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jchkMusic.setText("Music note");
        jPanel1.add(jchkMusic);
        jchkMusic.setBounds(200, 150, 150, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Drum FX");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 80, 190, 110);

        jPanel2.setLayout(null);

        D.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        D.setText("D");
        jPanel2.add(D);
        D.setBounds(260, 10, 50, 80);

        C.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        C.setText("C");
        jPanel2.add(C);
        C.setBounds(110, 10, 50, 80);

        G.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        G.setText("G");
        jPanel2.add(G);
        G.setBounds(60, 10, 50, 80);

        A.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        A.setText("A");
        jPanel2.add(A);
        A.setBounds(10, 10, 50, 80);

        B.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        B.setText("B");
        jPanel2.add(B);
        B.setBounds(160, 10, 50, 80);

        F.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        F.setText("F");
        jPanel2.add(F);
        F.setBounds(210, 10, 50, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(640, 10, 330, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFActionPerformed
        if (jchkMusic.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\F.wav");
        F.setText(String.valueOf(""));
        }
        
        
        else if (jchkSteel.isSelected()){
            playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\F_Drum.wav");
        }
    }//GEN-LAST:event_jbFActionPerformed

    private void jbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAActionPerformed
        A.setText(String.valueOf(""));
        if (jchkMusic.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\A.wav");
        A.setText(String.valueOf(""));
        }
        else if (jchkSteel.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\F_Drum.wav");
    }//GEN-LAST:event_jbAActionPerformed
    }
    private void jbCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCsActionPerformed
        // TODO add your handling code here:
        if (jchkMusic.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\C_s.wav");
        }
        else if (jchkSteel.isSelected()){
            playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\C_sDrum.wav");
        }
    }//GEN-LAST:event_jbCsActionPerformed

    private void jbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDActionPerformed
        // TODO add your handling code here:
        if (jchkMusic.isSelected()){
            playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\D.wav");
            D.setText(String.valueOf(""));
        }
        else if (jchkSteel.isSelected()){
            playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\D_Drum.wav");
        }
    }//GEN-LAST:event_jbDActionPerformed

    private void jbDsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDsActionPerformed
        // TODO add your handling code here:
        if (jchkMusic.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\D_s.wav");
        }
        else if (jchkSteel.isSelected()){
            playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\D_sDrum.wav");
        }
    }//GEN-LAST:event_jbDsActionPerformed

    private void jbEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\E.wav");
    }//GEN-LAST:event_jbEActionPerformed

    private void jbFsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFsActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\F_s.wav");
    }//GEN-LAST:event_jbFsActionPerformed

    private void jbGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\G.wav");
        G.setText(String.valueOf(""));
    }//GEN-LAST:event_jbGActionPerformed

    private void jbGsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGsActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\G_s.wav");
    }//GEN-LAST:event_jbGsActionPerformed

    private void jbBbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBbActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\Bb.wav");
    }//GEN-LAST:event_jbBbActionPerformed

    private void jbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\B.wav");
        B.setText(String.valueOf(""));
    }//GEN-LAST:event_jbBActionPerformed

    private void jbC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbC1ActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\C1.wav");
        C.setText(String.valueOf(""));
    }//GEN-LAST:event_jbC1ActionPerformed

    private void jbCs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCs1ActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\C_s1.wav");
    }//GEN-LAST:event_jbCs1ActionPerformed

    private void jbD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbD1ActionPerformed
        if (jchkMusic.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\D1.wav");
        
        }
        else if (jchkSteel.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\D1_Drum.wav");
        }
    }//GEN-LAST:event_jbD1ActionPerformed

    private void jbDs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDs1ActionPerformed
        if (jchkMusic.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\D_s1.wav");
    }
        else if (jchkSteel.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\Dq_Drum.wav");
        }
    }//GEN-LAST:event_jbDs1ActionPerformed

    private void jbE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbE1ActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\E1.wav");
    }//GEN-LAST:event_jbE1ActionPerformed

    private void jbF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbF1ActionPerformed
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\F1.wav");
    }//GEN-LAST:event_jbF1ActionPerformed

    private void jbDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDKeyPressed

    private void jbCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCKeyPressed
        // TOD:
       
        
        
       
    }//GEN-LAST:event_jbCKeyPressed

    private void jbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCActionPerformed
        if(jchkMusic.isSelected()){
                playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\C.wav");
               
        }else if(jchkSteel.isSelected()){
        playSound("C:\\Users\\Fuse TP\\Desktop\\NotePiao\\Music_Note\\Music_Note\\C_.wav");
        }
        
    }//GEN-LAST:event_jbCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Drum pn = new Drum();
        pn.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirtualPiano().setVisible(true);
                
            }
        });
        
    }
    public void playSound(String soundName)
 {
   try 
   {
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
    Clip clip = AudioSystem.getClip( );
    clip.open(audioInputStream);
    clip.start( );
   }
   catch(Exception ex)
   {
     System.out.println("Error with playing sound.");
     ex.printStackTrace( );
   }
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbA;
    private javax.swing.JButton jbB;
    private javax.swing.JButton jbBb;
    private javax.swing.JButton jbC;
    private javax.swing.JButton jbC1;
    private javax.swing.JButton jbCs;
    private javax.swing.JButton jbCs1;
    private javax.swing.JButton jbD;
    private javax.swing.JButton jbD1;
    private javax.swing.JButton jbDs;
    private javax.swing.JButton jbDs1;
    private javax.swing.JButton jbE;
    private javax.swing.JButton jbE1;
    private javax.swing.JButton jbF;
    private javax.swing.JButton jbF1;
    private javax.swing.JButton jbFs;
    private javax.swing.JButton jbG;
    private javax.swing.JButton jbGs;
    private javax.swing.JCheckBox jchkMusic;
    private javax.swing.JCheckBox jchkSteel;
    // End of variables declaration//GEN-END:variables
}
