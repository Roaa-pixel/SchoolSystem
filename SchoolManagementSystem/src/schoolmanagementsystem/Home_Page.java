/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pc
 */
public class Home_Page extends javax.swing.JFrame {

    /**
     * Creates new form Home_Page
     */
    public Home_Page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homelabel = new javax.swing.JLabel();
        choicelabel = new javax.swing.JLabel();
        StudentButton1 = new javax.swing.JButton();
        StudentButton2 = new javax.swing.JButton();
        StudentButton3 = new javax.swing.JButton();
        TeacherButton1 = new javax.swing.JButton();
        TeacherButton2 = new javax.swing.JButton();
        TeacherButton3 = new javax.swing.JButton();
        SupervisorButton1 = new javax.swing.JButton();
        SupervisorButton2 = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homelabel.setFont(new java.awt.Font("Californian FB", 3, 24)); // NOI18N
        homelabel.setLabelFor(homelabel);
        homelabel.setText("Home Page");

        choicelabel.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        choicelabel.setForeground(new java.awt.Color(0, 51, 255));
        choicelabel.setLabelFor(choicelabel);
        choicelabel.setText("Please select your choice: ");

        StudentButton1.setBackground(new java.awt.Color(204, 204, 204));
        StudentButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        StudentButton1.setText("Add Students");

        StudentButton2.setBackground(new java.awt.Color(204, 204, 204));
        StudentButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        StudentButton2.setForeground(new java.awt.Color(0, 51, 255));
        StudentButton2.setText("Edit/Delete Student");
        StudentButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButton2ActionPerformed(evt);
            }
        });

        StudentButton3.setBackground(new java.awt.Color(204, 204, 204));
        StudentButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        StudentButton3.setText("Display Students");
        StudentButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButton3ActionPerformed(evt);
            }
        });

        TeacherButton1.setBackground(new java.awt.Color(204, 204, 204));
        TeacherButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TeacherButton1.setForeground(new java.awt.Color(0, 51, 255));
        TeacherButton1.setText("Add Teachers");
        TeacherButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherButton1ActionPerformed(evt);
            }
        });

        TeacherButton2.setBackground(new java.awt.Color(204, 204, 204));
        TeacherButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TeacherButton2.setText("Edit/Delete Teacher");
        TeacherButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherButton2ActionPerformed(evt);
            }
        });

        TeacherButton3.setBackground(new java.awt.Color(204, 204, 204));
        TeacherButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TeacherButton3.setForeground(new java.awt.Color(0, 51, 255));
        TeacherButton3.setText("Display Teachers");
        TeacherButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherButton3ActionPerformed(evt);
            }
        });

        SupervisorButton1.setBackground(new java.awt.Color(204, 204, 204));
        SupervisorButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        SupervisorButton1.setText("Add Supervisor");

        SupervisorButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        SupervisorButton2.setForeground(new java.awt.Color(0, 51, 255));
        SupervisorButton2.setText("Remove Supervisor");

        ExitButton.setBackground(new java.awt.Color(204, 204, 204));
        ExitButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(choicelabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(homelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TeacherButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TeacherButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TeacherButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupervisorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupervisorButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(homelabel)
                .addGap(18, 18, 18)
                .addComponent(choicelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeacherButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeacherButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeacherButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupervisorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupervisorButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentButton3ActionPerformed
public void StudentButton3(java.awt.event.ActionEvent evt){
        StudentButton3ActionPerformed(evt);
    }
    private void TeacherButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherButton1ActionPerformed
        // TODO add your handling code here:
        AddTeachers tch=new AddTeachers();
        tch.setVisible(true);
        dispose();
    }//GEN-LAST:event_TeacherButton1ActionPerformed

    public void TeacherButton1(java.awt.event.ActionEvent evt){
        TeacherButton1ActionPerformed(evt);
    }
    
    
    
    private void StudentButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentButton2ActionPerformed
public void StudentButton2(java.awt.event.ActionEvent evt){
        StudentButton2ActionPerformed(evt);
    }
    private void TeacherButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherButton2ActionPerformed
        // TODO add your handling code here:
        EditTeacher t=new EditTeacher();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_TeacherButton2ActionPerformed

    public void TeacherButton2(java.awt.event.ActionEvent evt){
        TeacherButton2ActionPerformed(evt);
    }
    private void TeacherButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherButton3ActionPerformed
        // TODO add your handling code here:
        DisplayTeacher dt=new DisplayTeacher();
        dt.setVisible(true);
        dispose();
    }//GEN-LAST:event_TeacherButton3ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
       System.exit(1);
        
    }//GEN-LAST:event_ExitButtonActionPerformed
public void TeacherButton3(java.awt.event.ActionEvent evt){
        TeacherButton3ActionPerformed(evt);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException{
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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
            Thread t = new Thread(){
            @Override
           public void run(){
               while(true){
                   System.out.println("User thread is running");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home_Page.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
           }
       };
       
       t.start();
       Thread.sleep(200);
       System.out.println("terminating or closing java program");
       System.exit(1); //non zero value to exit says abnormal termination of JVM

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ExitButton;
    public javax.swing.JButton StudentButton1;
    public javax.swing.JButton StudentButton2;
    public javax.swing.JButton StudentButton3;
    public javax.swing.JButton SupervisorButton1;
    public javax.swing.JButton SupervisorButton2;
    public javax.swing.JButton TeacherButton1;
    public javax.swing.JButton TeacherButton2;
    public javax.swing.JButton TeacherButton3;
    private javax.swing.JLabel choicelabel;
    private javax.swing.JLabel homelabel;
    // End of variables declaration//GEN-END:variables
}
