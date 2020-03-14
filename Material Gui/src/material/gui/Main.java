/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package material.gui;

/**
 *
 * @author tapam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login loginWindow = new Login();
        loginWindow.setResizable(false);
        loginWindow.setTitle("Login Here");
        loginWindow.setVisible(true);
    }
    
}
