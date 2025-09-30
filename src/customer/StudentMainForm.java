
package customer;
public class StudentMainForm extends javax.swing.JFrame {
 private Student [] studentArray = new Student[0];
 
    public StudentMainForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchStudentForm = new javax.swing.JButton();
        btnAddStudentForm = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btnSearchStudentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(216, 216, 216)
                    .addComponent(btnAddStudentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnSearchStudentForm)
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(btnAddStudentForm)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean  addstudent(Student student){
        extendArrays();
        studentArray[studentArray.length-1]=student;
        return true;
    
    }
    public Student searchId(String id){
            for (Student student : studentArray) {
                if (student.getId().equalsIgnoreCase(id)) {
                    return student;
                }
        }
            return null;
    }
    private void btnAddStudentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentFormActionPerformed
       new AddNewStudent(this).setVisible(true);
    }//GEN-LAST:event_btnAddStudentFormActionPerformed

    private void btnSearchStudentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentFormActionPerformed
       new SearchForm(this).setVisible(true);
    }//GEN-LAST:event_btnSearchStudentFormActionPerformed
     private void extendArrays(){
        Student [] temp = new Student[studentArray.length+1];
        for (int i = 0; i <studentArray.length; i++) {
            temp[i] = studentArray[i];
        }
        studentArray = temp;
    }
    
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
    // End of variables declaration//GEN-END:variables
}
