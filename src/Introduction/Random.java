/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Random.java
 *
 * Created on 21 août 2011, 17:59:56
 */
package Introduction;

/**
 *
 * @author Guillaume Lafranceschina
 */
public class Random extends javax.swing.JFrame {

    private String WINDOW_TITLE = "Jeu du Random";
    
    
    /** Creates new form Random */
    public Random() {
        valRandom = (int) (Math.random() * 100);
        //nbrEssai = 0; // Pas besoin, on peut le définir directement en bas
        initComponents();
        setTitle(WINDOW_TITLE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RandomBtn = new javax.swing.JButton();
        saisieTxt = new javax.swing.JTextField();
        InfosPnl = new javax.swing.JPanel();
        AffichTxt = new javax.swing.JTextArea();
        RejouerPnl = new javax.swing.JPanel();
        rejouerBtn = new javax.swing.JButton();
        ScorePnl = new javax.swing.JPanel();
        ScoreLbl = new javax.swing.JLabel();
        QuitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Devine le chiffre !"));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        RandomBtn.setText("Vérifier");
        RandomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomBtnActionPerformed(evt);
            }
        });

        saisieTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        saisieTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saisieTxtActionPerformed(evt);
            }
        });
        saisieTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                saisieTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(saisieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(RandomBtn)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RandomBtn)
                    .addComponent(saisieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        InfosPnl.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations"));

        AffichTxt.setColumns(20);
        AffichTxt.setRows(5);

        javax.swing.GroupLayout InfosPnlLayout = new javax.swing.GroupLayout(InfosPnl);
        InfosPnl.setLayout(InfosPnlLayout);
        InfosPnlLayout.setHorizontalGroup(
            InfosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfosPnlLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(AffichTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        InfosPnlLayout.setVerticalGroup(
            InfosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfosPnlLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(AffichTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        rejouerBtn.setText("Rejouer");
        rejouerBtn.setEnabled(false);
        rejouerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejouerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RejouerPnlLayout = new javax.swing.GroupLayout(RejouerPnl);
        RejouerPnl.setLayout(RejouerPnlLayout);
        RejouerPnlLayout.setHorizontalGroup(
            RejouerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RejouerPnlLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(rejouerBtn)
                .addGap(235, 235, 235))
        );
        RejouerPnlLayout.setVerticalGroup(
            RejouerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RejouerPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rejouerBtn)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ScorePnl.setBorder(javax.swing.BorderFactory.createTitledBorder("Score"));

        ScoreLbl.setFont(new java.awt.Font("HelveticaNeueLT Std Blk", 0, 48));
        ScoreLbl.setForeground(new java.awt.Color(102, 102, 102));
        ScoreLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScoreLbl.setText("10");

        javax.swing.GroupLayout ScorePnlLayout = new javax.swing.GroupLayout(ScorePnl);
        ScorePnl.setLayout(ScorePnlLayout);
        ScorePnlLayout.setHorizontalGroup(
            ScorePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorePnlLayout.createSequentialGroup()
                .addComponent(ScoreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        ScorePnlLayout.setVerticalGroup(
            ScorePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorePnlLayout.createSequentialGroup()
                .addComponent(ScoreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        QuitBtn.setText("Quitter");
        QuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RejouerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(InfosPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ScorePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(QuitBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RejouerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InfosPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScorePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(QuitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void RandomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomBtnActionPerformed
    jouer();
}//GEN-LAST:event_RandomBtnActionPerformed

private void rejouerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejouerBtnActionPerformed

    // On veut rejouer, on choisi un nouveau random
    valRandom = (int) (Math.random() * 100);
    // On désactive le bouton Rejouer
    rejouerBtn.setEnabled(false);
    // On vide la valeur du label d'affichage
    AffichTxt.setText("");
    // Tant qu'à faire on vide aussi le champ du joueur
    saisieTxt.setText("");
    // Et on remet aussi à 0 le nombre d'essai
    nbrEssai = 0;
    // Reset du score
    score=10; ScoreLbl.setText(Integer.toString(score));
    // Reset du fil
    fil="";
    // On réactive tous les boutons
    RandomBtn.setEnabled(true);
    saisieTxt.setEnabled(true);

}//GEN-LAST:event_rejouerBtnActionPerformed

private void QuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBtnActionPerformed

    System.exit(1);

}//GEN-LAST:event_QuitBtnActionPerformed

private void saisieTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saisieTxtActionPerformed
  // merde.
}//GEN-LAST:event_saisieTxtActionPerformed

private void saisieTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saisieTxtKeyReleased

    if(evt.getKeyCode() == 10){
        jouer();
    }
    
}//GEN-LAST:event_saisieTxtKeyReleased

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
            java.util.logging.Logger.getLogger(Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Random().setVisible(true);
            }
        });
    }
    
    // On déclare la valeur en Random
    private int valRandom;
    private int nbrEssai=0;
    private int score=10;
    private String fil="";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AffichTxt;
    private javax.swing.JPanel InfosPnl;
    private javax.swing.JButton QuitBtn;
    private javax.swing.JButton RandomBtn;
    private javax.swing.JPanel RejouerPnl;
    private javax.swing.JLabel ScoreLbl;
    private javax.swing.JPanel ScorePnl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rejouerBtn;
    private javax.swing.JTextField saisieTxt;
    // End of variables declaration//GEN-END:variables

    private void jouer() {
        int valSaisie = Integer.parseInt(saisieTxt.getText());

        nbrEssai++; saisieTxt.setText("");
        
        score--;
        
        if(score == 0){ 
            // Perdu
            rejouerBtn.setEnabled(true);
            RandomBtn.setEnabled(false);
            saisieTxt.setEnabled(false);
            
        }

        ScoreLbl.setText(Integer.toString(score));

        if(valRandom == valSaisie){
            String message = "Gagné avec un score de "+score+" ! GG";
            rejouerBtn.setEnabled(true);
            AffichTxt.setText(message);
        }
        else if(valRandom > valSaisie){
            String message = "C'est plus! ";
            fil+=valSaisie+" < ";
            AffichTxt.setText(message+"\n"+fil);

        }
        else if(valRandom < valSaisie){
            String message = "C'est moins!";
            fil+=valSaisie+" > ";
            AffichTxt.setText(message+"\n"+fil);
        }
    }
}
