/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADM
 */
public class virus1_3 extends javax.swing.JFrame {

    /**
     * Creates new form virus1_3
     */
    public virus1_3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    int scor=0;
    Chapter L_java= new Chapter("langage_java");
                Lvl lvl3 = new Lvl( 3,1);
                int nb_enoncee;
              
               
                void boucleEnonce (int nb_enonce){
                 if (nb_enonce<5){     
        questionText.setText(lvl3.exercices[nb_enonce].box.affich_Fichier(1, 0, "Enonce",nb_enonce+1));
        r1.setText(lvl3.exercices[nb_enonce].printedLine.get(0));
         r2.setText(lvl3.exercices[nb_enonce].printedLine.get(1));
          r3.setText(lvl3.exercices[nb_enonce].printedLine.get(2));
           r4.setText(lvl3.exercices[nb_enonce].printedLine.get(3));
            
            
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
    private void decripteMouseClicked(java.awt.event.MouseEvent evt) {                                      
   boucleEnonce(0);
       
           
        
    }                                     

    private void r1MouseClicked(java.awt.event.MouseEvent evt) {                                
       if(lvl3.exercices[nb_enoncee].getIndexTrue()==0){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }                               

    private void r2MouseClicked(java.awt.event.MouseEvent evt) {                                
       if(lvl3.exercices[nb_enoncee].getIndexTrue()==1){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }                               

    private void r3MouseClicked(java.awt.event.MouseEvent evt) {                                
      if(lvl3.exercices[nb_enoncee].getIndexTrue()==2){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }                               

    private void r4MouseClicked(java.awt.event.MouseEvent evt) {                                
       if(lvl3.exercices[nb_enoncee].getIndexTrue()==3){
           scor++;
             decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.jpg")));
             nb_enoncee++;
             boucleEnonce(nb_enoncee);
       }else {
           decripte.setIcon(new javax.swing.ImageIcon(getClass().getResource("unlock1.gif")));
           nb_enoncee++;
           boucleEnonce(nb_enoncee);
       }
    }                               
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        decripte = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        decripte.setText("jButton1");
        jPanel1.add(decripte);
        decripte.setBounds(310, 280, 90, 80);

        buttonGroup1.add(r1);
        r1.setText("jRadioButton4");
        r1.setOpaque(false);
        jPanel1.add(r1);
        r1.setBounds(10, 90, 330, 23);

        buttonGroup1.add(r2);
        r2.setText("jRadioButton3");
        r2.setOpaque(false);
        jPanel1.add(r2);
        r2.setBounds(10, 120, 330, 23);

        buttonGroup1.add(r3);
        r3.setText("jRadioButton2");
        r3.setOpaque(false);
        jPanel1.add(r3);
        r3.setBounds(10, 150, 330, 23);

        buttonGroup1.add(r4);
        r4.setText("jRadioButton1");
        r4.setOpaque(false);
        jPanel1.add(r4);
        r4.setBounds(10, 180, 330, 23);

        questionText.setEditable(false);
        questionText.setBackground(new java.awt.Color(25, 45, 5));
        questionText.setColumns(20);
        questionText.setLineWrap(true);
        questionText.setRows(5);
        jScrollPane1.setViewportView(questionText);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(370, 70, 330, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vert.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 80, 340, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(virus1_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(virus1_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(virus1_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(virus1_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new virus1_3().setVisible(true);
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton decripte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea questionText;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables
}
