/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

/**
 *
 * @author Matteo Fernández
 */
public class ModelFactory {
    
    
    public static Model getModel(String type){
        Model model = null;
        if(type.equalsIgnoreCase("File")){
            model=new FileModelImplementation();
        }else{
        }
        return model;
    }
    
}
