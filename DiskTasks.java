/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.Prahlad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 
 */
public class DiskTasks extends javax.swing.JFrame {

    /**
     * Creates new form DiskTasks
     */
    //String 
    public DiskTasks() {
        initComponents();
    }
String namev;
String freqv;
String timev;
String namedef;
String freqdef;
String timedef;
String v;
String def;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 204));
        jButton2.setText("VIRUS SCAN");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 260, 160, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 204));
        jButton3.setText("DISK STATUS");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 330, 160, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 255, 204));
        jButton4.setText("EMPTY BIN");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 390, 160, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 255, 204));
        jButton5.setText("CLEAR TEMP");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(60, 460, 160, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 255, 204));
        jButton6.setText("BACK");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(640, 650, 130, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 255, 204));
        jButton7.setText("DEFRAGMENT");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(60, 190, 160, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setToolTipText("Enter Path");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(240, 250, 140, 60);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setToolTipText("ONCE/DAILY/WEEKLY");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(540, 180, 140, 60);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setToolTipText("ONCE/DAILY/WEEKLY");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(540, 250, 140, 60);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setToolTipText("Disk");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(240, 180, 140, 60);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(780, 250, 70, 60);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(780, 180, 70, 60);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(204, 255, 204));
        jButton10.setText("CLEAR CACHE");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(60, 530, 160, 40);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(204, 255, 204));
        jButton11.setText("EXIT");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(800, 650, 130, 40);
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(700, 180, 70, 60);
        getContentPane().add(jSpinner4);
        jSpinner4.setBounds(700, 250, 70, 60);

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 255, 204));
        jTextField1.setToolTipText("Path C/D/E/F");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(389, 180, 140, 60);

        jTextField6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 255, 204));
        jTextField6.setText("C:\\Users\\Mahe\\Desktop");
        jTextField6.setToolTipText("Path");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(390, 250, 140, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/Prahlad/DiskTools.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1120, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        namev=jTextField2.getText();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
try 
{ 
    
    Process p=Runtime.getRuntime().exec("cmd /c start C:Users\\Mahe\\Desktop\\IECache.bat");
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        } 

} 
catch(  IOException | InterruptedException e1) 
{
    
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try 
{ 
    
    Process p=Runtime.getRuntime().exec("cmd /c start C:Users\\Mahe\\Desktop\\Cleanup.exe");
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        } 

} 
catch(  IOException | InterruptedException e1) 
{
    
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  try
  {
    Process p=Runtime.getRuntime().exec("cmd /c start C:Users\\Mahe\\Desktop\\EmptyRecycleBin.exe");
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        } 

} 
catch(  IOException | InterruptedException e1) {}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try
  {
    Process p=Runtime.getRuntime().exec("cmd /c start diskmgmt.msc");
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        } 

} 
catch(  IOException | InterruptedException e1) {}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
this.setVisible(false);
 new Rating().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.setVisible(false);
 new Home().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        timedef=jSpinner3.getValue().toString()+":"+ jSpinner2.getValue().toString();
        namedef=jTextField5.getText();
        freqdef=jTextField3.getText();
        def = "cmd /c schtasks /create /sc "+freqdef+" /tn "+namedef+" /st "+timedef+" /tr "+ "C:\\Users\\Mahe\\Desktop\\SE\\Defrag.bat"; 
        System.out.println(def);
              try
            
  {
    
    Process p=Runtime.getRuntime().exec(def);
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        } 

} 
catch(  IOException | InterruptedException e1) {}      
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        timev=jSpinner4.getValue().toString()+":"+ jSpinner1.getValue().toString();
        namev=jTextField2.getText();
        freqv=jTextField4.getText();
        v = "cmd /c schtasks /create /sc "+freqv+" /tn "+namev+" /st "+timev+" /tr "+ "C:\\Users\\Mahe\\Desktop\\Scan.bat";
        System.out.println(v);
              try
            
  {
    
    Process p=Runtime.getRuntime().exec(v);
    p.waitFor();
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
        { 
            System.out.println(line); 
            line=reader.readLine(); 
        } 

} 
catch(  IOException | InterruptedException e1) {}      
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DiskTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiskTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiskTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiskTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiskTasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}