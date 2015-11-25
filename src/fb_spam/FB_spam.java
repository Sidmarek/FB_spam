package fb_spam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;



/**
 *
 * @author Marek
 */
public class FB_spam extends javax.swing.JFrame {

    

    /**
     * Creates new form FB_spam
     */
    boolean welcome_bol = false;
    boolean first_bol = false;
    boolean second_bol = false;
    boolean third_bol = false;
    boolean fourth_bol = false;
    boolean fifth_bol = false;
    boolean sixth_bol = false;
    boolean goodbye_bol = false;
    private static Robot robot = null;
    boolean url = false;
    public FB_spam() {
        initComponents();
        
    }
    
    private void macro() {
         String group_link_text = group_link.getText();
        if (group_link_text.isEmpty()) {
         url = false;
        } else {
         url = true;
        }
        String user_link_text = user_link.getText();
        if (user_link_text.isEmpty()) {
         url = false;
        } else {
         url = true;
         StringSelection userlinkSelection = new StringSelection(user_link_text);
         Clipboard clipboard_userlink = Toolkit.getDefaultToolkit().getSystemClipboard();
         clipboard_userlink.setContents(userlinkSelection, null);
         click (1000, 60);
         click (1000, 60);
         click (1000, 60);
         robot.delay(100);
         robot.keyPress(KeyEvent.VK_DELETE);
         robot.delay(1000);
         robot.keyRelease(KeyEvent.VK_DELETE);
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         robot.delay(1000);
        }
        if (url == true) {
        
        String message = message_area.getText();
        System.out.printf(message);
        
        StringSelection stringSelection = new StringSelection(message);
        Clipboard clipboard_message = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard_message.setContents(stringSelection, null);
        
        click (1600, 1010);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        } else {
            status.setText("Zadejte prosím url uživatele nebo skupiny");
        }
        robot.delay(600);
        robot.mouseMove(960, 350);
    }

    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        message_area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        user_link = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        group_link = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        welcome_but = new javax.swing.JButton();
        first_sentence_but = new javax.swing.JButton();
        second_sentence_but = new javax.swing.JButton();
        ending_but = new javax.swing.JButton();
        third_sentence_but = new javax.swing.JButton();
        fourth_sentence_but = new javax.swing.JButton();
        fifth_sentence_but = new javax.swing.JButton();
        sixth_sentence_but = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        messages_numeber = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        send.setText("Odeslat");
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendMouseReleased(evt);
            }
        });
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        message_area.setColumns(20);
        message_area.setRows(5);
        jScrollPane1.setViewportView(message_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 420, 180));

        jLabel1.setText("Zadejte svou zpravu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        user_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_linkActionPerformed(evt);
            }
        });
        getContentPane().add(user_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 270, 30));

        jLabel2.setText("Zadejte odkaz na uzivatele");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 20));

        group_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group_linkActionPerformed(evt);
            }
        });
        getContentPane().add(group_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 270, -1));

        jLabel3.setText("Zadejte odkaz na skupinu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        welcome_but.setText("Pozdrav");
        welcome_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                welcome_butMouseReleased(evt);
            }
        });
        welcome_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcome_butActionPerformed(evt);
            }
        });
        getContentPane().add(welcome_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 120, 30));

        first_sentence_but.setText("1.Veta");
        first_sentence_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                first_sentence_butMouseReleased(evt);
            }
        });
        first_sentence_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_sentence_butActionPerformed(evt);
            }
        });
        getContentPane().add(first_sentence_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 120, 30));

        second_sentence_but.setText("Otravování");
        second_sentence_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                second_sentence_butMouseReleased(evt);
            }
        });
        getContentPane().add(second_sentence_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 130, 30));

        ending_but.setText("Rozlouceni");
        ending_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ending_butMouseReleased(evt);
            }
        });
        getContentPane().add(ending_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 130, 30));

        third_sentence_but.setText("3.Veta");
        third_sentence_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                third_sentence_butMouseReleased(evt);
            }
        });
        getContentPane().add(third_sentence_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 130, 30));

        fourth_sentence_but.setText("4.Veta");
        fourth_sentence_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fourth_sentence_butMouseReleased(evt);
            }
        });
        fourth_sentence_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourth_sentence_butActionPerformed(evt);
            }
        });
        getContentPane().add(fourth_sentence_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 30));

        fifth_sentence_but.setText("5.Veta");
        fifth_sentence_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fifth_sentence_butMouseReleased(evt);
            }
        });
        getContentPane().add(fifth_sentence_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 130, 30));

        sixth_sentence_but.setText("6.Veta");
        sixth_sentence_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sixth_sentence_butMouseReleased(evt);
            }
        });
        getContentPane().add(sixth_sentence_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 130, 30));

        status.setBackground(java.awt.Color.red);
        status.setFont(new java.awt.Font("DilleniaUPC", 0, 36)); // NOI18N
        status.setForeground(java.awt.Color.red);
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("Status");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 380, 30));

        jLabel4.setText("Zadejte pocet zprav:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));
        getContentPane().add(messages_numeber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendActionPerformed

    private void user_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_linkActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_user_linkActionPerformed

    private void group_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group_linkActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_group_linkActionPerformed

    private void sendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseReleased
        String m_n = messages_numeber.getText();
        int messages_count = Integer.parseInt(m_n);
        while (messages_count>0) {
        macro();
        }
    }//GEN-LAST:event_sendMouseReleased

    private void welcome_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcome_butActionPerformed
             
    }//GEN-LAST:event_welcome_butActionPerformed

    private void first_sentence_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_sentence_butActionPerformed
               
    }//GEN-LAST:event_first_sentence_butActionPerformed

    private void fourth_sentence_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourth_sentence_butActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourth_sentence_butActionPerformed

    private void welcome_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcome_butMouseReleased
        //Generate welcome message
        if (welcome_bol == false) {
        String welcome[]=  { "Dobrý den", "Zdar", "Ahoj", "Cau", "Čau", "Nazdar" ,"Zdravim", "Ahojky", "Cauky", "Nazdárek"};
        Random rand_welcome = new Random();
        int int_rand_welcome = rand_welcome.nextInt(9) + 1;
        message_area.setText(welcome[int_rand_welcome]);
        welcome_bol = true;
        }
    }//GEN-LAST:event_welcome_butMouseReleased

    private void first_sentence_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_first_sentence_butMouseReleased
        // Generate first sentence
        
        if (first_bol == false) {
        String first_sentence[] = {
            "Pohonů chytrý metry behaviorálního bobří, podobají.", 
            "Západu terapií či obdivují současně výjimečný týmem funkce roste oranžově obcí.",
            "Čechem své států bojovníka ně pohonů ze běžkaře?",
            "Bezvadně ně 4 000 př. n. l. letního kotel, tryskají shakespearovské přičemž skutečně pól psychologické řeči.",
            "Problémem službu krize hor jezera dispozici explozi, ozdobených nejen její dní, z často. Laně, půl hladce.",
            "Vedla nalezen skříni ovcí ji radar společenský, dvě u kontroluje. ",
            "Jednotném bílého světu zda poslem neúnavnou radiové, vystoupáte kráse naše sám, s hmotu.",
            "Zemích, pár vlivem lidi po lanovkou občanské přizpůsobuje i matky projevilo 320 dospělého u sluneční smrt choroboplodných chirurgy",
            "Států zuří koráby stát, mého gamy k hraniceběhem naplňování.",
            "Nízké níže zoologie, od borci čím rok studii EU kůrou kůrou u městečkem z při",
        };
        Random rand_first_sentence = new Random();
        int int_rand_first_sentence = rand_first_sentence.nextInt(9) + 1;
        message_area.setText(message_area.getText() + "\n" + first_sentence[int_rand_first_sentence]);
        first_bol = true;
        }
    }//GEN-LAST:event_first_sentence_butMouseReleased

    private void second_sentence_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_second_sentence_butMouseReleased
        // Generate second sentence
         if (second_bol == false) {
        String second_sentence[] = {"Nechces mi to zobrazit třeba?", "Měla by jsi mi odpovídat", "Neber to jako spam, ale myslím, že by jsi mi mohla odepsat", "Veta 2.4 - blablablabla",
                                    "Napiš mi ihned díky", "Jsem hodně zvědav, kdy mi odpovíš", "Nelber to špatně, ale tohle mi prostě musíš zobrazit :)",
                                    "Taky by tě zajímalo proč ti píši tolik :)", "Nechceš si psát-nebudeme", "Napiš mi prosím, díky"};
        Random rand_second_sentence = new Random();
        int int_rand_second_sentence = rand_second_sentence.nextInt(9) + 1;
        message_area.setText(message_area.getText() + "\n" + second_sentence[int_rand_second_sentence]);
        second_bol = true;
        }
    }//GEN-LAST:event_second_sentence_butMouseReleased

    private void third_sentence_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_third_sentence_butMouseReleased
         // Generate third sentence
         if (third_bol == false) {
        String third_sentence[] = {"Veta 3.1 - bla", "Veta 3.2 - lala", "Veta 3.3 - lalala", "Veta 3.4 - lalalala",
                                    "Veta 3.5", "Veta 3.6", "Veta 3.7", "Veta 3.8", "Veta 3.9", "Veta 3.10"};
        Random rand_third_sentence = new Random();
        int int_rand_third_sentence = rand_third_sentence.nextInt(9) + 1;
        message_area.setText(message_area.getText() + "\n" + third_sentence[int_rand_third_sentence]);
        third_bol = true;
        }
    }//GEN-LAST:event_third_sentence_butMouseReleased

    private void fourth_sentence_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourth_sentence_butMouseReleased
         // Generate fourth sentence
         if (fourth_bol == false) {
        String fourth_sentence[] = {"Veta 4.1 - bla", "Veta 4.2 - lala", "Veta 4.4 - lalala", "Veta 4.4 - lalalala",
                                    "Veta 4.5", "Veta 4.6", "Veta 4.7", "Veta 4.8", "Veta 4.9", "Veta 4.10"};
        Random rand_fourth_sentence = new Random();
        int int_rand_fourth_sentence = rand_fourth_sentence.nextInt(9) + 1;
        message_area.setText(message_area.getText() + "\n" + fourth_sentence[int_rand_fourth_sentence]);
        fourth_bol = true;
        }
    }//GEN-LAST:event_fourth_sentence_butMouseReleased

    private void fifth_sentence_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fifth_sentence_butMouseReleased
        // Generate fifth sentence
         if (fifth_bol == false) {
        String fifth_sentence[] = {"Veta 5.1 - bla", "Veta 5.2 - lala", "Veta 5.4 - lalala", "Veta 5.5 - lalalala",
                                    "Veta 5.5", "Veta 5.6", "Veta 5.7", "Veta 5.8", "Veta 5.9", "Veta 5.10"};
        Random rand_fifth_sentence = new Random();
        int int_rand_fifth_sentence = rand_fifth_sentence.nextInt(9) + 1;
        message_area.setText(message_area.getText() + "\n" + fifth_sentence[int_rand_fifth_sentence]);
        fifth_bol = true;
        }
    }//GEN-LAST:event_fifth_sentence_butMouseReleased

    private void sixth_sentence_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixth_sentence_butMouseReleased
        // Generate sixth sentence
         if (sixth_bol == false) {
        String sixth_sentence[] = {"Veta 6.1 - bla", "Veta 6.2 - lala", "Veta 6.4 - lalala", "Veta 6.5 - lalalala",
                                    "Veta 6.71", "Veta 6.72", "Veta 6.7", "Veta 6.8", "Veta 6.9", "Veta 6.10"};
        Random rand_sixth_sentence = new Random();
        int int_rand_sixth_sentence = rand_sixth_sentence.nextInt(9) + 1;
        message_area.setText(message_area.getText() + "\n" + sixth_sentence[int_rand_sixth_sentence]);
        sixth_bol = true;
        }
    }//GEN-LAST:event_sixth_sentence_butMouseReleased

    private void ending_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ending_butMouseReleased
       //Generate goodbye message
         if (goodbye_bol == false) {
        String goodbye[]=  { "Přeji hezký den", "Hezký den", "Naschledanou", "Nachle", "Měj se", "Čus" ,"Zdar", "Zdarec", "Nazdar", "Nazdárek"};
        Random rand_goodbye = new Random();
        int int_rand_welcome = rand_goodbye.nextInt(9) + 1;
        message_area.setText(message_area.getText() + "\n" +  goodbye[int_rand_welcome]);
        goodbye_bol = true;
        }
    }//GEN-LAST:event_ending_butMouseReleased
    public void click (int x, int y) {
        /**
         * Defines a mouse click 
        */
        robot.mouseMove(x, y);
        robot.delay(2);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON2_MASK);
        
    }
    
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
           } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FB_spam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        
        //Launch autoclicker robot
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FB_spam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ending_but;
    private javax.swing.JButton fifth_sentence_but;
    private javax.swing.JButton first_sentence_but;
    private javax.swing.JButton fourth_sentence_but;
    private javax.swing.JTextField group_link;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea message_area;
    private javax.swing.JTextField messages_numeber;
    private javax.swing.JButton second_sentence_but;
    private javax.swing.JButton send;
    private javax.swing.JButton sixth_sentence_but;
    private javax.swing.JLabel status;
    private javax.swing.JButton third_sentence_but;
    private javax.swing.JTextField user_link;
    private javax.swing.JButton welcome_but;
    // End of variables declaration//GEN-END:variables
}