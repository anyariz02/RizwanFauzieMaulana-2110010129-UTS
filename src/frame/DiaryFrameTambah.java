/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Diary;

/**
 *
 * @author anyariz02
 */
public class DiaryFrameTambah extends javax.swing.JFrame {
    
    //format untuk save tanggal
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    
    int positionX = 0;
    int positionY = 0;
    
    //deklarasi variabel untuk status edit dan tambah
    int status = 0;
    private final int tambah = 0;
    private final int update = 1;
    
    //membuat id menjadi auto increment
    public int IdIncrement(){
        Diary lastDiary = DiaryFrame.diarys.get(DiaryFrame.diarys.size()-1);
        int id = lastDiary.getIdDiary()+1;
        return id;
    }
    
    //method untuk merubah format tanggal
    public Date getFormatDate(String tanggal){
        try{
            Date tanggalDiary = (Date) dateFormat.parse(tanggal);
            return tanggalDiary;
        }catch (ParseException ex){
            System.err.println("Error Tanggal : "+ex);
            return new Date(System.currentTimeMillis());
        }
    }
    
    public void reset(){
        
    }
    
    //konstruktor utama yang merupakan frame tambah
    public DiaryFrameTambah() {
        initComponents();
        status = tambah;
        setLocationRelativeTo(this);
        getContentPane().setBackground(new java.awt.Color(19, 19, 19));
    }
    
    //konstruktor kedua yang merupakan frame edit
    public DiaryFrameTambah(Diary diary){
        initComponents();
        status = update;
        
        //menampilkan data baru yang sudah diambil sebelumnya pada design edit
        lbPanel.setText("Edit Catatan");
        tfId.setText(String.valueOf(diary.getIdDiary()));
        tfJudul.setText(diary.getJudul());
        dpTanggal.setDate(getFormatDate(diary.getTanggal()));
        taCatatan.setText(diary.getCatatan());
        
        setLocationRelativeTo(this);
        getContentPane().setBackground(new java.awt.Color(19, 19, 19));
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfJudul = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCatatan = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbPanel = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        dpTanggal = new org.jdesktop.swingx.JXDatePicker();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul");

        taCatatan.setBackground(new java.awt.Color(51, 51, 51));
        taCatatan.setColumns(20);
        taCatatan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        taCatatan.setForeground(new java.awt.Color(255, 255, 255));
        taCatatan.setLineWrap(true);
        taCatatan.setRows(5);
        taCatatan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(taCatatan);

        btnSimpan.setBackground(new java.awt.Color(27, 188, 155));
        btnSimpan.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(51, 51, 51));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(27, 188, 155));
        jButton2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Batal");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal");

        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Catatan");

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));

        lbPanel.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        lbPanel.setForeground(new java.awt.Color(255, 255, 255));
        lbPanel.setText("Tambah Catatan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbPanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lbPanel)
                .addGap(14, 14, 14))
        );

        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Ambil tanggal hari ini");
        jCheckBox1.setInheritsPopupMenu(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(27, 188, 155));
        btnReset.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(51, 51, 51));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSimpan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(21, 21, 21)
                            .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dpTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(jButton2)
                    .addComponent(btnReset))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        //mengambil data pada design
        String judul = tfJudul.getText();
        String tanggal = dateFormat.format(dpTanggal.getDate());
        String catatan = taCatatan.getText();
        
        //jika sedang status tambah dan data pada tabel kosong maka dituliskan 1
        //dan jika data sudah ada, menjalakan method In increment
        if(status==tambah){
            int id=1;
            if(!DiaryFrame.diarys.isEmpty()){
                id = IdIncrement();
            }
            
            if(tfJudul.getText().isEmpty() ||
                taCatatan.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Masukkan data catatan terlebih dulu");
            }else{
                JOptionPane.showMessageDialog(null, "Catatan berhasil ditambah");
             DiaryFrame.diarys.add(new Diary(id,tanggal,judul,catatan));
            }
            
             
        // sebaliknya jika status edit, lakukan perulangan pada arraylist diarys
        // jika menemukan id yang sama, maka lakukan break
        }else{
            int index = 0;
            for(Diary d: DiaryFrame.diarys){
                if(d.getIdDiary() == Integer.parseInt(tfId.getText())){
                    index = DiaryFrame.diarys.indexOf(d);
                    break;
                }
            }
            
        // set data yang telat di edit
        
         JOptionPane.showMessageDialog(null, "Catatan berhasi diedit");
            DiaryFrame.diarys.set(index, new Diary(Integer.parseInt(tfId.getText()),tanggal,judul,catatan));
        }
       dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //set posisi kordinat x dan y dari mouse yang digerakkan 
       //merupakan bagian dari panel undecorated agar bisa di drag
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_formMouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      //mengambil data tanggal pada hari ini dan set tanggal pada datePicker dengan
      //data tanggal yg sudah diambil
      Date date = new Date();
      String dateNow = dateFormat.format(date);
      dpTanggal.setDate(getFormatDate(dateNow));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       tfJudul.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        //set posisi kordinat x dan y menjadi 0
       //merupakan bagian dari panel undecorated agar bisa di drag
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       tfJudul.setText("");
       dpTanggal.setDate(null);
       taCatatan.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(DiaryFrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaryFrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaryFrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaryFrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiaryFrameTambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private org.jdesktop.swingx.JXDatePicker dpTanggal;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPanel;
    private javax.swing.JTextArea taCatatan;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfJudul;
    // End of variables declaration//GEN-END:variables
}
