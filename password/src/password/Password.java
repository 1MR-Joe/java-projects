/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password = "admin";
        
        
        
        
        for(int i = 1; i < 4; i++){
            System.out.println("chance" + " "+ i + ":");
            
            Scanner x = new Scanner(System.in);
        
            String input = x.nextLine();
            
            if(input == password){
                System.out.println("correct password");
                break;
            } else {
             return;
            }
        }
    }
    
}
