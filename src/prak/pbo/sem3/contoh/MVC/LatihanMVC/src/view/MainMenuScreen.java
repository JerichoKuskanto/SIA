/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author hanschristian
 */
public class MainMenuScreen {
    
    public MainMenuScreen() {
        showMainMenu();
    }
    
    private void showMainMenu() {
        Boolean menu = true;
        while(menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1.Login \n2.Registrasi \n3.Exit"));
            switch(choosen) {
                case 1: new LoginScreen();
                    break;
                case 2: new RegisterScreen();
                    break;
                case 3: menu = false;
                    break;
            }
        }
    }
}
