/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumloop;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class Sumloop {

    public static void main(String[] args) {
        int i = 0;
        int input = 0;
        
        do{
            Scanner x = new Scanner(System.in);
            
            input = x.nextInt();
            
            i = i + input;
        }while(input != 0);
        
        System.out.println("total is " + i);
    }
}
