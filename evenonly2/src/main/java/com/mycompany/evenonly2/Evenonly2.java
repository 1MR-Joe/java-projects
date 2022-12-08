/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evenonly2;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class Evenonly2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int input = x.nextInt();
        
        int i = 0;
        do{
            System.out.println(i + " is even");
            i += 2;
        }while(i <= input);
    }
}
