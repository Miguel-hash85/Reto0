/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0;

import reto0.controller.Controller;
import reto0.model.Model;
import reto0.view.View;

/**
 *
 * @author 2dam
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new
        Model model = new Model() {
        };
        View view = new View() {
            @Override
            public void showGreeting(String greeting) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Controller controller = new Controller();

        // TODO: model=ModelFactory.getModelInstance().getModel(ModelFactory.TYPE);
        // TODO: view=ViewFactory.getViewInstance().getView(ViewFactory.TYPE);
        controller.run(model, view);
    }

}
