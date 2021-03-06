/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class AddTeachers extends javax.swing.JFrame {

    /**
     * Creates new form AddTeachers
     */
    public AddTeachers() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        AddTeacherLabel = new javax.swing.JLabel();
        TeacherName = new javax.swing.JLabel();
        TeacherAge = new javax.swing.JLabel();
        TeacherSal = new javax.swing.JLabel();
        GradDegree = new javax.swing.JLabel();
        GradYear = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        t_namefield = new javax.swing.JTextField();
        t_agefield = new javax.swing.JTextField();
        t_salaryfield = new javax.swing.JTextField();
        t_gdyearfield = new javax.swing.JTextField();
        t_degfield = new javax.swing.JTextField();
        t_expfield = new javax.swing.JTextField();
        t_subjectfield = new javax.swing.JTextField();
        T_SubmitBtn = new javax.swing.JButton();
        T_BackButton = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddTeacherLabel.setFont(new java.awt.Font("Californian FB", 3, 24)); // NOI18N
        AddTeacherLabel.setText("Teacher Registration");

        TeacherName.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TeacherName.setText("Name:");

        TeacherAge.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TeacherAge.setText("Age:");

        TeacherSal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TeacherSal.setText("Salary:");

        GradDegree.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        GradDegree.setText("Graduation Degree:");

        GradYear.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        GradYear.setText("Graduation Year:");

        experience.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        experience.setText("Years Of experience:");

        subject.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        subject.setText("Subject:");

        t_namefield.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        t_namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namefieldActionPerformed(evt);
            }
        });

        t_agefield.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        t_agefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_agefieldActionPerformed(evt);
            }
        });

        t_salaryfield.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        t_gdyearfield.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        t_degfield.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        t_degfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_degfieldActionPerformed(evt);
            }
        });

        t_expfield.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        t_subjectfield.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        t_subjectfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_subjectfieldActionPerformed(evt);
            }
        });

        T_SubmitBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        T_SubmitBtn.setForeground(new java.awt.Color(255, 0, 0));
        T_SubmitBtn.setText("Submit");
        T_SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_SubmitBtnActionPerformed(evt);
            }
        });

        T_BackButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        T_BackButton.setForeground(new java.awt.Color(0, 51, 255));
        T_BackButton.setText("Back");
        T_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddTeacherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(subject)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(experience)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GradYear)
                                        .addComponent(GradDegree)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_subjectfield, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_expfield, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_degfield, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_gdyearfield, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_namefield, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TeacherSal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TeacherAge, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_agefield)
                                    .addComponent(t_salaryfield))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(T_SubmitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T_BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(AddTeacherLabel)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeacherName)
                    .addComponent(t_namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeacherAge)
                    .addComponent(t_agefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_salaryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeacherSal))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GradYear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_gdyearfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GradDegree)
                    .addComponent(t_degfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_expfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experience))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject)
                    .addComponent(t_subjectfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_SubmitBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(T_BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_agefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_agefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_agefieldActionPerformed

    private void t_degfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_degfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_degfieldActionPerformed

    private void t_subjectfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_subjectfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_subjectfieldActionPerformed

    private void T_SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_SubmitBtnActionPerformed
        // TODO add your handling code here:
        String t_name=t_namefield.getText();
        String t_age=t_agefield.getText();
        String t_salary=t_salaryfield.getText();
        String t_degree=t_degfield.getText();
        String t_year=t_gdyearfield.getText();
        String t_exp=t_expfield.getText();
        String t_sub=t_subjectfield.getText();
        if(t_name.equals("")||t_age.equals("")||t_salary.equals("")||t_degree.equals("")||t_year.equals("")||t_exp.equals("")||t_sub.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please fill all data required.");
            
            
        }
        else{
            Person teacher1=new Teacher(t_name,t_age,t_salary,t_degree,t_year,t_exp,t_sub);
            List<Teacher> list1=new ArrayList<>();
            SchoolManagementSystem s=new SchoolManagementSystem();
            s.AddToSchool(list1);
            list1.add((Teacher)teacher1);
        JOptionPane.showMessageDialog(rootPane, "Your data has been recorded.");
        }
        
    }//GEN-LAST:event_T_SubmitBtnActionPerformed

    public void T_SubmitButton(java.awt.event.ActionEvent evt){
        T_SubmitBtnActionPerformed(evt);
    }
    
    
    
    private void T_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_BackButtonActionPerformed
        // TODO add your handling code here:
        Home_Page hm=new Home_Page();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_T_BackButtonActionPerformed

    private void t_namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namefieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddTeacherLabel;
    public javax.swing.JLabel GradDegree;
    public javax.swing.JLabel GradYear;
    public javax.swing.JButton T_BackButton;
    public javax.swing.JButton T_SubmitBtn;
    public javax.swing.JLabel TeacherAge;
    public javax.swing.JLabel TeacherName;
    public javax.swing.JLabel TeacherSal;
    public javax.swing.JLabel experience;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    public javax.swing.JLabel subject;
    public javax.swing.JTextField t_agefield;
    public javax.swing.JTextField t_degfield;
    public javax.swing.JTextField t_expfield;
    public javax.swing.JTextField t_gdyearfield;
    public javax.swing.JTextField t_namefield;
    public javax.swing.JTextField t_salaryfield;
    public javax.swing.JTextField t_subjectfield;
    // End of variables declaration//GEN-END:variables
}
