import com.mycompany.practica5.Lienzo;
import com.mycompany.practica5.Utils;
import java.awt.event.ItemEvent;
import static javax.swing.JOptionPane.showMessageDialog;


public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
        
    public Frame() {
        initComponents();
        lienzo = new Lienzo();
        updateColors();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lienzo = new com.mycompany.practica5.Lienzo();
        logo = new com.mycompany.practica5.Logo();
        configuration = new javax.swing.JPanel();
        checkBoxAll = new javax.swing.JCheckBox();
        checkBoxRed = new javax.swing.JCheckBox();
        checkBoxGreen = new javax.swing.JCheckBox();
        checkBoxBlue = new javax.swing.JCheckBox();
        rbRightUpperCorner = new javax.swing.JRadioButton();
        rbLeftUpperCorner = new javax.swing.JRadioButton();
        rbLowerLeftCorner = new javax.swing.JRadioButton();
        rbLowerRightCorner = new javax.swing.JRadioButton();
        choosePlaceLogo = new javax.swing.JLabel();
        selectColors = new javax.swing.JLabel();
        labelNames = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lienzo.setToolTipText("");

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
        );

        configuration.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuration"));

        checkBoxAll.setSelected(true);
        checkBoxAll.setText("All");
        checkBoxAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAllActionPerformed(evt);
            }
        });

        checkBoxRed.setSelected(true);
        checkBoxRed.setText("Red");
        checkBoxRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxRedActionPerformed(evt);
            }
        });

        checkBoxGreen.setSelected(true);
        checkBoxGreen.setText("Green");
        checkBoxGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxGreenActionPerformed(evt);
            }
        });

        checkBoxBlue.setSelected(true);
        checkBoxBlue.setText("Blue");
        checkBoxBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBlueActionPerformed(evt);
            }
        });

        buttonGroup.add(rbRightUpperCorner);
        rbRightUpperCorner.setSelected(true);
        rbRightUpperCorner.setText(" Right upper corner");
        rbRightUpperCorner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRightUpperCornerActionPerformed(evt);
            }
        });

        buttonGroup.add(rbLeftUpperCorner);
        rbLeftUpperCorner.setText("Left upper corner");
        rbLeftUpperCorner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLeftUpperCornerActionPerformed(evt);
            }
        });

        buttonGroup.add(rbLowerLeftCorner);
        rbLowerLeftCorner.setText(" Lower left corner");
        rbLowerLeftCorner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLowerLeftCornerActionPerformed(evt);
            }
        });

        buttonGroup.add(rbLowerRightCorner);
        rbLowerRightCorner.setText(" Lower right corner");
        rbLowerRightCorner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLowerRightCornerActionPerformed(evt);
            }
        });

        choosePlaceLogo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        choosePlaceLogo.setText("Choose a place to put the logo:");

        selectColors.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        selectColors.setText("Select colors:");

        javax.swing.GroupLayout configurationLayout = new javax.swing.GroupLayout(configuration);
        configuration.setLayout(configurationLayout);
        configurationLayout.setHorizontalGroup(
            configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configurationLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(selectColors)
                .addGap(18, 18, 18)
                .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxGreen)
                    .addComponent(checkBoxAll)
                    .addComponent(checkBoxBlue)
                    .addComponent(checkBoxRed))
                .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(configurationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(choosePlaceLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(configurationLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbRightUpperCorner)
                            .addComponent(rbLowerLeftCorner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbLeftUpperCorner)
                            .addComponent(rbLowerRightCorner))
                        .addGap(70, 70, 70))))
        );
        configurationLayout.setVerticalGroup(
            configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configurationLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAll)
                    .addComponent(selectColors)
                    .addComponent(choosePlaceLogo))
                .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(configurationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxGreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxBlue))
                    .addGroup(configurationLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbLeftUpperCorner)
                            .addComponent(rbRightUpperCorner))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxRed)
                    .addComponent(rbLowerRightCorner)
                    .addComponent(rbLowerLeftCorner))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        labelNames.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelNames.setText("Created By Viviana Benítez & Alexander Alvares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelNames, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(configuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNames, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbRightUpperCornerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRightUpperCornerActionPerformed
        logo.moveImageRightUpper();
    }//GEN-LAST:event_rbRightUpperCornerActionPerformed

    private void rbLeftUpperCornerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLeftUpperCornerActionPerformed
        logo.moveImageLeftUpper();
    }//GEN-LAST:event_rbLeftUpperCornerActionPerformed

    private void rbLowerLeftCornerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLowerLeftCornerActionPerformed
        logo.moveImageLeftLower();
    }//GEN-LAST:event_rbLowerLeftCornerActionPerformed

    private void rbLowerRightCornerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLowerRightCornerActionPerformed
        logo.moveImageRightLower();
    }//GEN-LAST:event_rbLowerRightCornerActionPerformed

    private void checkBoxGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxGreenActionPerformed

        if(!checkBoxBlue.isSelected() && !checkBoxRed.isSelected()){
            checkBoxGreen.setSelected(true);
            showMessageDialog(null, "This button cannot be deselected as there must be a minimum color selected!");  
        }
            allCheckBoxSelect();
            updateColors();
        //lienzo.setImage(Utils.seleccionarComponentes(Lienzo.getImage(), checkBoxRed.isSelected(), checkBoxGreen.isSelected(), checkBoxBlue.isSelected()));
        logo.getGraphics().drawImage(logo.getLogo(), 0, 0, rootPane);
    }//GEN-LAST:event_checkBoxGreenActionPerformed

    private void checkBoxRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxRedActionPerformed
    
        if(!checkBoxGreen.isSelected() && !checkBoxBlue.isSelected()){
            checkBoxRed.setSelected(true);  
            showMessageDialog(null, "This button cannot be deselected as there must be a minimum color selected");
           
        }
            allCheckBoxSelect();
            updateColors();
        //lienzo.setImage(Utils.seleccionarComponentes(Lienzo.getImage(), checkBoxRed.isSelected(), checkBoxGreen.isSelected(), checkBoxBlue.isSelected()));
        logo.getGraphics().drawImage(logo.getLogo(), 0, 0, rootPane);
    }//GEN-LAST:event_checkBoxRedActionPerformed

    private void checkBoxBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBlueActionPerformed
 
        if(!checkBoxGreen.isSelected() && !checkBoxRed.isSelected()){
            checkBoxBlue.setSelected(true);
            showMessageDialog(null, "This button cannot be deselected as there must be a minimum color selected");
        }
        allCheckBoxSelect();
        updateColors();
       // lienzo.setImage(Utils.seleccionarComponentes(Lienzo.getImage(), checkBoxRed.isSelected(), checkBoxGreen.isSelected(), checkBoxBlue.isSelected()));
            logo.getGraphics().drawImage(logo.getLogo(), 0, 0, rootPane);
    }//GEN-LAST:event_checkBoxBlueActionPerformed

    private void checkBoxAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAllActionPerformed
         //lienzo.setImage(Utils.seleccionarComponentes(Lienzo.getImage(), checkBoxRed.isSelected(), checkBoxGreen.isSelected(), checkBoxBlue.isSelected()));
        
        if( checkBoxAll.isSelected() ){
            checkBoxBlue.setSelected(true);
            checkBoxGreen.setSelected(true);
            checkBoxRed.setSelected(true);
            updateColors();
            logo.getGraphics().drawImage(logo.getLogo(), 0, 0, rootPane);
            
        }
    }//GEN-LAST:event_checkBoxAllActionPerformed

    public void allCheckBoxSelect(){
        if( checkBoxBlue.isSelected() && checkBoxRed.isSelected() && checkBoxGreen.isSelected() ){
            checkBoxAll.setSelected(true);
        }else {
            checkBoxAll.setSelected(false);
        }
    }
    
    public void updateColors(){
        this.lienzo.setImage(Utils.seleccionarComponentes(Lienzo.getImage(), checkBoxRed.isSelected(), checkBoxGreen.isSelected(), checkBoxBlue.isSelected()));
        repaint();
    }
    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JCheckBox checkBoxAll;
    private javax.swing.JCheckBox checkBoxBlue;
    private javax.swing.JCheckBox checkBoxGreen;
    private javax.swing.JCheckBox checkBoxRed;
    private javax.swing.JLabel choosePlaceLogo;
    private javax.swing.JPanel configuration;
    private javax.swing.JLabel labelNames;
    private com.mycompany.practica5.Lienzo lienzo;
    private com.mycompany.practica5.Logo logo;
    private javax.swing.JRadioButton rbLeftUpperCorner;
    private javax.swing.JRadioButton rbLowerLeftCorner;
    private javax.swing.JRadioButton rbLowerRightCorner;
    private javax.swing.JRadioButton rbRightUpperCorner;
    private javax.swing.JLabel selectColors;
    // End of variables declaration//GEN-END:variables
}
