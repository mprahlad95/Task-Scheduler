/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.Prahlad;

import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *

 */
public class MiscTasks extends javax.swing.JFrame {

    /**
     * Creates new form MiscTasks
     */
    String freq, c, d, e, f, g, ss, namess, frequencyss, timess, namere, timere, frequencyre, namest, frequencyst, timest;
    public MiscTasks() {
        initComponents();
        
        namere="";
        frequencyre="";
        timere="";
        namest="";
        frequencyst="";
        timest="";
        freq="";
        c="";
        d="";
        e="";
        f="";
        g="";
        timess="";
        namess="";
        frequencyss="";
        ss="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 204));
        jButton1.setText("POWER OFF");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 240, 160, 50);

        jButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 204));
        jButton2.setText("RESTART");
        jButton2.setToolTipText("");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 310, 130, 50);

        jButton3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 204));
        jButton3.setText("SCREENSHOT");
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 380, 160, 50);

        jButton4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 255, 204));
        jButton4.setText("DOWNLOAD");
        jButton4.setToolTipText("");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 170, 140, 50);

        jSpinner1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(870, 170, 70, 60);

        jSpinner2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(570, 310, 70, 50);

        jSpinner3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(570, 370, 70, 60);

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.setToolTipText("ONCE/DAILY/WEEKLY");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(640, 170, 140, 60);

        jTextField3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField3.setToolTipText("ONCE/DAILY/WEEKLY");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(330, 310, 140, 50);

        jTextField4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField4.setToolTipText("ONCE/DAILY/WEEKLY");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(330, 370, 140, 60);

        jTextField5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField5.setToolTipText("Task Name");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(180, 170, 140, 60);

        jTextField6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField6.setToolTipText("Task Name");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(180, 240, 140, 60);

        jTextField7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField7.setToolTipText("Task Name");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(180, 310, 140, 50);

        jTextField8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField8.setToolTipText("Task Name");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(180, 370, 140, 60);

        jTextField10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField10.setToolTipText("ONCE/DAILY/WEEKLY");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(330, 240, 140, 60);

        jButton5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 255, 204));
        jButton5.setText("BACK");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(643, 650, 130, 50);

        jButton6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 255, 204));
        jButton6.setText("EXIT");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(800, 650, 130, 50);

        jSpinner5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner5);
        jSpinner5.setBounds(790, 170, 70, 60);

        jSpinner6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner6);
        jSpinner6.setBounds(490, 310, 70, 50);

        jSpinner7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner7);
        jSpinner7.setBounds(490, 370, 70, 60);

        jSpinner8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner8);
        jSpinner8.setBounds(570, 240, 70, 60);

        jSpinner9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jSpinner9);
        jSpinner9.setBounds(490, 240, 70, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "       ", "http://tinyurl.com/kbm56ht", "http://tinyurl.com/m4f23kc", "http://tinyurl.com/n6p4r5k" }));
        jComboBox1.setToolTipText("Download Path");
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(330, 170, 140, 60);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "C:\\Users\\Mahe\\Desktop\\Download.jpg" }));
        jComboBox2.setToolTipText("Save As");
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(490, 170, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/Prahlad/MiscTools.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      //bitsadmin /transfer myDownloadJob /download /priority normal http://downloadsrv/10mb.zip c:\10mb.zip;
      timess= jSpinner7.getValue().toString()+ ":"+ jSpinner3.getValue().toString();
      //d="bitsadmin /transfer "+ a + " /download /priority normal" + b+ " "+ c;
      frequencyss=jTextField4.getText();
      namess=jTextField8.getText();
      ss = "cmd /c schtasks /create /sc "+frequencyss+" /tn "+namess+" /st "+timess+" /tr "+ "\"C:\\Users\\Mahe\\Desktop\\SE\\Screenshot\\SaveSS1.vbs\"";
      System.out.println(ss);
              try
            
  {
    
    Process p=Runtime.getRuntime().exec(ss);
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        } 

} 
catch(  IOException | InterruptedException e1) {}            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
               try 
{ 
   frequencyre = jTextField3.getText();
   timere = jSpinner6.getValue()+ ":" + jSpinner2.getValue();
   namere = jTextField7.getText();
     
    
    String s1 = "cmd /c schtasks /create /sc "+frequencyre+" /tn "+namere+" /st "+timere+" /tr "+"\"shutdown-i -r -t 0 -f\"";
    //String s1 = "cmd /c schtasks /create /sc daily /tn restart1 /st 09:46:00 /tr "+"\"shutdown.exe -r -t 0 -f\"";
    System.out.println(s1);
    Process p=Runtime.getRuntime().exec(s1);
    
 
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        }
    }                                        
catch(  IOException | InterruptedException e1) {
    } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try 
{ 
   frequencyst = jTextField10.getText();
   timest = jSpinner9.getValue()+ ":" + jSpinner8.getValue();
   namest = jTextField6.getText();
     
    
    String s1 = "cmd /c schtasks /create /sc "+frequencyst+" /tn "+namest+" /st "+timest+" /tr "+"\"shutdown.exe -r -t 0 -f\"";
    //String s1 = "cmd /c schtasks /create /sc daily /tn restart1 /st 09:46:00 /tr "+"\"shutdown.exe -r -t 0 -f\"";
    System.out.println(s1);
    Process p=Runtime.getRuntime().exec(s1);
    
 
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed
catch(  IOException | InterruptedException e1) {
    }  
    }
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        
     
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.setVisible(false);
 new Home().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.setVisible(false);
 new Rating().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        //frequencyss=jTextField4.getText();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
        //namess=jTextField8.getText();
    }//GEN-LAST:event_jTextField8ActionPerformed


        
           
    

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
            java.util.logging.Logger.getLogger(MiscTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiscTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiscTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiscTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiscTasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
