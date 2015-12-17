
import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADM
 */
public class Virus1 extends javax.swing.JFrame {
   
    

    /**
     * Creates new form Virus1
     */
    public Virus1() {
        initComponents();
        back.setContentAreaFilled(false);
    }
    


    
    @SuppressWarnings("unchecked")
    int scor=0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        decripte = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionText = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        decripte.setText("jButton2");
        decripte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decripteMouseClicked(evt);
            }
        });
        jPanel1.add(decripte);
        decripte.setBounds(330, 270, 100, 70);

        buttonGroup1.add(r1);
        r1.setForeground(new java.awt.Color(204, 255, 204));
        r1.setOpaque(false);
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1MouseClicked(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(0, 80, 340, 21);

        buttonGroup1.add(r4);
        r4.setForeground(new java.awt.Color(204, 255, 204));
        r4.setOpaque(false);
        r4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r4MouseClicked(evt);
            }
        });
        jPanel1.add(r4);
        r4.setBounds(0, 170, 340, 23);

        buttonGroup1.add(r2);
        r2.setForeground(new java.awt.Color(204, 255, 204));
        r2.setOpaque(false);
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2MouseClicked(evt);
            }
        });
        jPanel1.add(r2);
        r2.setBounds(0, 110, 340, 21);

        buttonGroup1.add(r3);
        r3.setForeground(new java.awt.Color(204, 255, 204));
        r3.setOpaque(false);
        r3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r3MouseClicked(evt);
            }
        });
        jPanel1.add(r3);
        r3.setBounds(0, 140, 340, 21);

        questionText.setEditable(false);
        questionText.setBackground(new java.awt.Color(25, 45, 5));
        questionText.setColumns(20);
        questionText.setForeground(new java.awt.Color(204, 255, 204));
        questionText.setLineWrap(true);
        questionText.setRows(5);
        jScrollPane2.setViewportView(questionText);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(400, 80, 320, 140);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back.setText("Menu");
        jPanel1.add(back);
        back.setBounds(610, 10, 80, 60);

        jLabel3.setBackground(new java.awt.Color(0, 51, 0));
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vert.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 50, 350, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 780, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 Chapter L_java= new Chapter("langage_java");
                Lvl lvl1 = new Lvl( 1,1);
                int nb_enoncee;
              
               
                void boucleEnonce (int nb_enonce){
                 if (nb_enonce<5){     
        questionText.setText(lvl1.exercices[nb_enonce].box.affich_Fichier(1, 0, "Enonce",nb_enonce+1));
        r1.setText(lvl1.exercices[nb_enonce].printedLine.get(0));
         r2.setText(lvl1.exercices[nb_enonce].printedLine.get(1));
          r3.setText(lvl1.exercices[nb_enonce].printedLine.get(2));
           r4.setText(lvl1.exercices[nb_enonce].printedLine.get(3));
            
            
                 }else {
                     if(scor<2){
                         
                    
           GameOver c= new GameOver();
              c.setVisible(true);
                      this.hide();}
                     else {
                         sécurisé c= new sécurisé();
                          c.setVisible(true);
                                  this.hide();
                         
                     }
        }
                    
                }
    private void r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseClicked
       if(lvl1.exercices[nb_enoncee].getIndexTrue()==0){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }//GEN-LAST:event_r1MouseClicked

    private void r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseClicked
       if(lvl1.exercices[nb_enoncee].getIndexTrue()==1){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }//GEN-LAST:event_r2MouseClicked

    private void r3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r3MouseClicked
      if(lvl1.exercices[nb_enoncee].getIndexTrue()==2){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }//GEN-LAST:event_r3MouseClicked

    private void r4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r4MouseClicked
       if(lvl1.exercices[nb_enoncee].getIndexTrue()==3){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }//GEN-LAST:event_r4MouseClicked

    private void decripteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decripteMouseClicked
       Choix c= new Choix();
                          c.setVisible(true);
                                  this.hide();
    }//GEN-LAST:event_decripteMouseClicked
 
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
            java.util.logging.Logger.getLogger(Virus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Virus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Virus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Virus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Virus1().setVisible(true);
               
          /*questionText.setText(lvl1.exercices[0].box.affich_Fichier(1, 0, "Enonce"));*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton decripte;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea questionText;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables
}
