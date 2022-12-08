/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mypass;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class Mypass {

    public static void main(String[] args) {
        String pass = "pass";
        
        String input = null;
        
        int i = 0;
        
        do{
            Scanner x = new Scanner(System.in);
            input = x.nextLine();

        }while(!input.equals(pass));
        
        System.out.println("correct pass!");
        
        
    }
}
