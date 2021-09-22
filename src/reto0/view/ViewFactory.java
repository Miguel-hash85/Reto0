/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

/**
 *
 * @author Matteo Fernández
 */
public class ViewFactory {
    
    
    public static View getView(String type){
        View view=null;
        if(type.equalsIgnoreCase("Text")){
            view=new TextViewImplementation();
        }
        return view;
    }
    
}
