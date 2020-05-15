/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Pasindu Thiwanka
 */
public class Input {
    
    public static String getInput(String value){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(value);
        System.out.flush();
        
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            return "Error";
        }
    }
    
    
    public static int getInt(String value) throws NumberFormatException{
        
        String in = getInput(value);
        return Integer.parseInt(in);
    } 
    
}
