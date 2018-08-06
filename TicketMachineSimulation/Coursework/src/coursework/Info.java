
package coursework;

/*
The Purpose if this class is to show an image and brief Synonpsis of the movie
that the user has selected from the list in the main class.
*/
public  class Info extends javax.swing.JFrame {
int val=5;//initialise variable so it can be manipulated later.
    /**
     * Creates new form Info
     */
    public Info(String mName, int value) {//gets values from previous jframe
        String name = mName;
        val = value;
        initComponents();
        this.setLocationRelativeTo(null);//centers the window.
        nameLabel.setText(name);
        setImage();//method is used to check which image should be displayed base on
                   //the selected movie.
    }

    private Info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Movie Information");
        setPreferredSize(new java.awt.Dimension(640, 480));

        nameLabel.setText("jLabel1");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addGap(243, 243, 243)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/placeholder.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(imgLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(imgLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textArea1.setEditable(false);
        textArea1.setColumns(20);
        textArea1.setRows(5);
        textArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Coursework c = new Coursework();//closes this and creates new instance of main class.
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
                
            }
        });
    }
            private  void setImage(){ //this method determines what image and description should be shown.
        //sets the image and text area descrption based on the users selected values
        //descriptions were taken from either www.imdb.com or www.wikipedia.com
        if(val == 2){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/arrival.jpg")));
            textArea1.setText("Arrival is a 2016 American science fiction film\ndirected by Denis Villeneuve and written by\nEric Heisserer, based on the short story\n\"Story of Your Life\" \nby Ted Chiang. It stars Amy Adams, \nJeremy Renner and Forest Whitaker.");
        }else if(val == 3){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/allied.jpg")));
            textArea1.setText("Allied is a 2016 World War II romantic thriller film\ndirected by Robert Zemeckis and written by\nSteven Knight. It follows two assassins who fall in love \nduring a mission to kill a German official and stars\nBrad Pitt, Marion Cotillard,\n Jared Harris, Lizzy Caplan and Simon McBurney.");
        }else if(val ==4){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/auk.jpg")));
            textArea1.setText("A United Kingdom is a \nBritish[5] biographical \nromantic drama film directed by \nAmma Asante \nand starring David Oyelowo and Rosamund \nPike. \nThe screenplay is by Guy Hibbert,\n based on the book Colour Bar by Susan \nWilliams. \nThe film is based on the true-life \nromance between\nSir Seretse Khama and his\n wife Ruth Williams \nKhama.");
        }else if(val == 5){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/bs2.jpg")));
            textArea1.setText("Bad Santa 2 is a 2016 American \nChristmas black comedy crime film \ndirected by Mark Waters and \nwritten by Shauna Cross and \nJohnny Rosenthal. A sequel to the \n2003 film Bad Santa after thirteen years, \nthe film stars Billy Bob Thornton, \nTony Cox, Brett Kelly, Kathy Bates and \nChristina Hendricks and features Willie \nand Marcus again teaming up to rob \na Chicago charity on Christmas Eve");
        }else if (val == 6){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/DrStrange.jpg")));
            textArea1.setText("A former neurosurgeon embarks on\n a journey of healing only to be \ndrawn into the world of the \nmystic arts");
        }else if(val == 7){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/fantastical.jpg")));
            textArea1.setText("The adventures of writer Newt Scamander \nin New York's secret community of \nwitches and wizards seventy years \nbefore Harry Potter reads \nhis book in school.");
        }else if(val==8){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/moana.jpg")));
            textArea1.setText("In Ancient Polynesia, when a terrible \ncurse incurred by Maui reaches an impetuous \nChieftain's daughter's island, she \nanswers the Ocean's call to seek out \nthe demigod to set things right");
        }else if(val ==9){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/starwars.jpg")));
            textArea1.setText("The Rebellion makes a risky move \nto steal the plans to the Death Star, \nsetting up the epic saga to follow.");
        }else if(val ==10){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/theacc.jpg")));
            textArea1.setText("As a math savant uncooks the books for \na new client, the Treasury Department \ncloses in on his activities and \nthe body count starts to rise.");
        }else if(val==11){
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/trolls.jpg")));
            textArea1.setText("After the Bergens invade Troll Village, \nPoppy, the happiest Troll ever born, \nand the curmudgeonly Branch set \noff on a journey to rescue her friends.");
        }else
        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coursework/placeholder.jpg")));
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea textArea1;
    // End of variables declaration//GEN-END:variables
}