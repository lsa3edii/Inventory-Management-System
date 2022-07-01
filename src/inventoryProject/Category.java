package inventoryProject;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Category extends javax.swing.JFrame {

    private int line, currentRow;
    
    public Category() {
        initComponents();
    }

    
    boolean addData(){
        try {
            RandomAccessFile raf = new RandomAccessFile("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\category.txt", "rw");
            for(int i=0 ; i < line ; i++){
                raf.readLine();
            }
            raf.writeBytes(idCat.getText() + "\t");
            raf.writeBytes(name.getText() + "\t\n");
            return true;

        } catch (IOException ex) {
            return false;
        }
    }
    
    boolean checkData(){
        if(idCat.getText().equals("")||name.getText().equals(""))
            return true;
        else
            return false;
    }
      
    void countLine() {
        try {
            line =1;
            RandomAccessFile raf = new RandomAccessFile("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\category.txt", "rw");
            while(raf.readLine() != null){
                line++;
            }
            System.out.println("number of line: " + line);
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }

    }
  
    void showCat(){
        DefaultTableModel model = (DefaultTableModel) catTable.getModel();

        try {
            File myfile = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\category.txt");
            Scanner input = new Scanner(myfile);

            while (input.hasNext()) {
                String line = input.nextLine();
                String[] row = line.split("\t");
                model.addRow(row);
            }

        } catch (FileNotFoundException ex) {

        }
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        exitApp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        idCat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Management System");

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Century Schoolbook", 3, 30)); // NOI18N
        back.setForeground(new java.awt.Color(255, 51, 51));
        back.setText("←");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        exitApp.setBackground(new java.awt.Color(255, 255, 255));
        exitApp.setFont(new java.awt.Font("Century Schoolbook", 3, 27)); // NOI18N
        exitApp.setForeground(new java.awt.Color(255, 51, 51));
        exitApp.setText("X");
        exitApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitAppMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("\"CATEGORY\" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(303, 303, 303))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        catTable.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        catTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        catTable.setRowHeight(25);
        catTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        catTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        catTable.setShowGrid(true);
        jScrollPane2.setViewportView(catTable);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Category List");

        idCat.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        idCat.setForeground(new java.awt.Color(255, 51, 51));

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Name");

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("ID");

        name.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        name.setForeground(new java.awt.Color(255, 51, 51));

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 51, 51));
        edit.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 51, 51));
        add.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idCat, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(delete)
                        .addGap(33, 33, 33)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void exitAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitAppMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitAppMouseClicked

    
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        String path = "D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\category.txt";
        File myfile = new File(path);

        try {
            FileWriter fw = new FileWriter(myfile);
            BufferedWriter bw = new BufferedWriter(fw);

            DefaultTableModel model = (DefaultTableModel) catTable.getModel();

            if(catTable.getSelectedRowCount() == 1){
                model.removeRow(catTable.getSelectedRow());

                for(int i=0 ; i<catTable.getRowCount() ; i++){
                    for(int j=0 ; j<catTable.getColumnCount() ; j++){

                        bw.write(catTable.getValueAt(i, j) + "\t");
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();

                JOptionPane.showMessageDialog(null, "Deleted Done!!");
            }

            else {
                JOptionPane.showMessageDialog(null, "Please Clicked in \"SHOW USERS\" First\nThen Select one Row from table!!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        String path = "D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\category.txt";
        File myfile = new File(path);

        try {
            FileWriter fw = new FileWriter(myfile);
            BufferedWriter bw = new BufferedWriter(fw);

            DefaultTableModel model = (DefaultTableModel) catTable.getModel();

            currentRow = catTable.getSelectedRow();
            model.setValueAt(idCat.getText(), currentRow, 0);
            model.setValueAt(name.getText(), currentRow, 1);
            if (catTable.getSelectedRowCount() == 1) {
                for (int i = 0; i < catTable.getRowCount(); i++) {
                    for (int j = 0; j < catTable.getColumnCount(); j++) {

                        bw.write(catTable.getValueAt(i, j) + "\t");
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();

                JOptionPane.showMessageDialog(null, "Successfuly Edited.");

            } else {
                JOptionPane.showMessageDialog(null, "Please Clicked in \"SHOW USERS\" First\nThen Select one Row from table!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");

        }
    }//GEN-LAST:event_editMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        countLine();

        if(checkData()) {
            JOptionPane.showMessageDialog(null, "Operation failed !!", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        else if(addData()) {
            JOptionPane.showMessageDialog(null, "Successfuly added.");
            idCat.setText("");
            name.setText("");

            DefaultTableModel model = (DefaultTableModel)catTable.getModel();
            model.setNumRows(0);

            try {
                File myfile = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\category.txt");

                Scanner input = new Scanner(myfile);
                while (input.hasNext()) {
                    String line = input.nextLine();
                    String[] row = line.split("\t");
                    model.addRow(row);
                }
            } catch (FileNotFoundException ex) {

            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Operation failed !!", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTable catTable;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exitApp;
    private javax.swing.JTextField idCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}