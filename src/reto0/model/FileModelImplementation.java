/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Matteo Fernández
 */
public class FileModelImplementation implements Model{
    
    Properties propiedades = new Properties();
    InputStream saludoFile;

    @Override
    public String getGreeting() throws Exception {
        saludoFile= new FileInputStream("data.properties");
        propiedades.load(saludoFile);
        return propiedades.getProperty("greeting");   
    }
    
}
