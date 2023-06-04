package login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;
import main.Menu_Utama;

/**
 *
 * @author USER
 */
public class Form_Login extends javax.swing.JFrame {

    /**
     * Creates new form form_login
     */
    public Form_Login() {
        initComponents();
        t_password.setEchoChar('\u25cf');

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        profile_icon = new javax.swing.JLabel();
        username_icon = new javax.swing.JLabel();
        password_icon = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        t_password = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        bt_login = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Gudang Jaya Abadi");
        setMinimumSize(new java.awt.Dimension(400, 111));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("GUDANG JAYA ABADI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        profile_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile_icon.jpg"))); // NOI18N
        getContentPane().add(profile_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        username_icon.setBackground(new java.awt.Color(255, 255, 255));
        username_icon.setForeground(new java.awt.Color(0, 0, 0));
        username_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/username_icon.png"))); // NOI18N
        getContentPane().add(username_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 20, 40));

        password_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password_icon.png"))); // NOI18N
        getContentPane().add(password_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 40));

        t_username.setBackground(new java.awt.Color(255, 255, 255));
        t_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_username.setForeground(new java.awt.Color(0, 0, 0));
        t_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_username.setText("username");
        t_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        getContentPane().add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 40));

        t_password.setBackground(new java.awt.Color(255, 255, 255));
        t_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_password.setForeground(new java.awt.Color(0, 0, 0));
        t_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_password.setText("password");
        t_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordFocusLost(evt);
            }
        });
        getContentPane().add(t_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 40));

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("show");
        jToggleButton1.setBorder(null);
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 50, 40));

        bt_login.setBackground(new java.awt.Color(0, 0, 0));
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setText("LOGIN");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        getContentPane().add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_login.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        String username = "jayaabadi";
        String password = "jayaabadi";
        
        char[] tPassword = t_password.getPassword();
        String passwordString = new String(tPassword);
        
        if (t_username.getText().equals(username) && passwordString.equals(password)) {
            JOptionPane.showMessageDialog(null, "Login berhasil");
            
            Menu_Utama menu = new Menu_Utama();
            menu.setVisible(true);
            menu.revalidate();
        
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "username / password salah");
        }
    }//GEN-LAST:event_bt_loginActionPerformed

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        String username=t_username.getText();
        if (username.equals("username")) {
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String username=t_username.getText();
        if (username.equals("")||username.equals("username")) {
            t_username.setText("username");
        }
    }//GEN-LAST:event_t_usernameFocusLost
    
    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        if (jToggleButton1.isSelected()) {
            t_password.setEchoChar((char)0);
            jToggleButton1.setText("hide");
        } else {
            t_password.setEchoChar('\u25cf');
            jToggleButton1.setText("show");
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void t_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusGained
        char[] password = t_password.getPassword();
        String passwordString = new String(password);
        if (passwordString.equals("password")) {
            t_password.setText("");
        }
    }//GEN-LAST:event_t_passwordFocusGained

    private void t_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusLost
        char[] password = t_password.getPassword();
        String passwordString = new String(password);
        if (passwordString.equals("") || passwordString.equals("password")) {
            t_password.setText("password");
            t_password.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_t_passwordFocusLost

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
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Login().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel password_icon;
    private javax.swing.JLabel profile_icon;
    private javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_username;
    private javax.swing.JLabel username_icon;
    // End of variables declaration//GEN-END:variables

}