
package customer;
public class StudentMainForm extends javax.swing.JFrame {
 private StudentCollection studentCollection;
 
    public StudentMainForm() {
        initComponents();
        setLocationRelativeTo(null);
        studentCollection = new StudentCollection();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchStudentForm = new javax.swing.JButton();
        btnAddStudentForm = new javax.swing.JButton();
        btnUpdateForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearchStudentForm.setText("SEARCH STUDENT");
        btnSearchStudentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudentFormActionPerformed(evt);
            }
        });

        btnAddStudentForm.setText("ADD STUDENT FORM");
        btnAddStudentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentFormActionPerformed(evt);
            }
        });

        btnUpdateForm.setText("UPDATE STUDENT");
        btnUpdateForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateForm, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchStudentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStudentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnAddStudentForm)
                .addGap(18, 18, 18)
                .addComponent(btnSearchStudentForm)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateForm)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAddStudentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentFormActionPerformed
       new AddNewStudent(studentCollection).setVisible(true);
    }//GEN-LAST:event_btnAddStudentFormActionPerformed

    private void btnSearchStudentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentFormActionPerformed
       new SearchForm(studentCollection).setVisible(true);
    }//GEN-LAST:event_btnSearchStudentFormActionPerformed

    private void btnUpdateFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFormActionPerformed
       new UpdateForm(studentCollection).setVisible(true);
    }//GEN-LAST:event_btnUpdateFormActionPerformed
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudentForm;
    private javax.swing.JButton btnSearchStudentForm;
    private javax.swing.JButton btnUpdateForm;
    // End of variables declaration//GEN-END:variables
}
