/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import machine.Config;

/**
 *
 * @author admin
 */
public class FSettings extends javax.swing.JDialog {

    private Config cf;
    private boolean ResetNeeded;
    
    /**
     * Creates new form FSettings
     */
    public FSettings() {
        initComponents();
        ResetNeeded = false;
    }
    
    public boolean isResetNeeded() {
        return ResetNeeded;
    }
    
    public void showDialog(Config conf) {
        cf = conf;
        
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen.width-getSize().width)/2, (screen.height-getSize().height)/2);
        setModal(true);
        setVisible(true);
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(414, 335));
        setMinimumSize(new java.awt.Dimension(414, 335));
        setModal(true);
        setName("SettingsDlg");
        setPreferredSize(new java.awt.Dimension(414, 335));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(0));

        bOk.setText("Ok");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(bOk)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(bOk)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
        setVisible(false);
        setModal(false);
    }//GEN-LAST:event_bOkActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
