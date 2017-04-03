/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ServerClient.Client;
import ServerClient.Server;

/**
 *
 * @author lenovo
 */
public class BB84GUI extends javax.swing.JFrame {

    
    public BB84GUI() {
        initComponents();
        networkPC.setVisible(false);
        findServer.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moduleSelection = new javax.swing.JComboBox();
        start = new javax.swing.JButton();
        networkPC = new javax.swing.JTextField();
        findServer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        moduleSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Server", "Client" }));
        moduleSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleSelectionActionPerformed(evt);
            }
        });

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        networkPC.setToolTipText("");

        findServer.setText("find");
        findServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findServerActionPerformed(evt);
            }
        });

        messageArea.setEditable(false);
        messageArea.setColumns(20);
        messageArea.setRows(5);
        jScrollPane1.setViewportView(messageArea);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(networkPC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moduleSelection, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(findServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moduleSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkPC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findServer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        if(moduleSelection.getSelectedItem().toString().equalsIgnoreCase("Server")){
            // start my server
            networkPC.setVisible(false);
            findServer.setVisible(false);
            Server server = new ServerClient.Server(messageArea);
        }
        else{
            networkPC.setVisible(true);
            findServer.setVisible(true);
        }
    }//GEN-LAST:event_startActionPerformed

    private void findServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findServerActionPerformed
        Client client = new Client(networkPC.getText(), messageArea);
    }//GEN-LAST:event_findServerActionPerformed

    private void moduleSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleSelectionActionPerformed
        if(moduleSelection.getSelectedItem().toString().equalsIgnoreCase("Server")){
            networkPC.setVisible(false);
            findServer.setVisible(false);
        }else{
            networkPC.setVisible(true);
            findServer.setVisible(true);
        }
    }//GEN-LAST:event_moduleSelectionActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton findServer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JComboBox moduleSelection;
    private javax.swing.JTextField networkPC;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
