/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.controller;


import java.util.logging.Level;
import java.util.logging.Logger;
import reto0.model.Model;
import reto0.view.View;

/**
 *
 * @author Matteo Fernández
 */
public class Controller {
    

    public void run(Model model, View view) {
        
        try {
            view.showGreeting(model.getGreeting());
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

}
