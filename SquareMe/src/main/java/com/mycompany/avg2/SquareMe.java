/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.avg2;

/**
 *
 * @author mahmoud
 */
public class SquareMe {

    public static int squareMe(int num1){
        int a = (int) Math.pow(num1, 2);
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println((10 + 20)/2);
        System.out.println((50 + 70)/2);
        
        int squared = squareMe(2);
        System.out.println(squared);
       
    }
    
    
}
