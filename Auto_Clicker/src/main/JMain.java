package main;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JMain extends javax.swing.JFrame {

    private boolean status=false;
    public JMain() {
        initComponents();
    }
    
    private String on_off(boolean status){
        if(status == true){
            return "ON";
        }else{
            return "OFF";
        }
    }
    private void click() throws AWTException{
        String status = on_off(this.status);
        Robot rb = new Robot();
        rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        if(status.equals("ON")){
            click();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button_ligar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Clicker Java");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        button_ligar.setText("F8 to enable *OFF*");
        button_ligar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_ligarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_ligar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_ligar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        menu_about.setText("About");
        menu_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ligarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_ligarMouseClicked
        if(this.status == false){
            this.status = true;
            String status = on_off(this.status);
            if(status.equals("ON")){
                button_ligar.setText("F8 to enable *ON*");
                validate();
                try {
                    click();
                } catch (AWTException ex) {
                    Logger.getLogger(JMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                button_ligar.setText("F8 to enable *OFF*");
                validate();
            }
        }else{
            this.status = false;
        }
    }//GEN-LAST:event_button_ligarMouseClicked

    private void menu_aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_aboutMouseClicked
        JOptionPane.showMessageDialog(null, "Auto Clicker v1.0","About",JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_menu_aboutMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F8){
            if(this.status == false){
                this.status = true;
                String status = on_off(this.status);
                if(status.equals("ON")){
                    button_ligar.setText("F8 to enable *ON*");
                    validate();
                    try {
                        click();
                    } catch (AWTException ex) {
                        Logger.getLogger(JMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    button_ligar.setText("F8 to enable *OFF*");
                    validate();
                }
            }else{
                this.status = false;
            }
        }
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_ligar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu_about;
    // End of variables declaration//GEN-END:variables
}
