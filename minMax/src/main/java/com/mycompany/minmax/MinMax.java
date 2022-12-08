/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minmax;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class MinMax {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int min = 0;
        
        System.out.print("enter a number : ");
        int v = x.nextInt();
        
        min = v;
        
        for(int i = 1; i < 5; i++){
            System.out.print("enter another number : ");
            v = x.nextInt();
            
            min = (v < min)? v : min;
        }
        
        System.out.println();
        System.out.println("the minimum value is : " + min);
        
        
        
        
        
        
        
        
        
        
        
//        System.out.print("enter a number : ");
//        int num1 = x.nextInt();
//        
//        int min = num1;
//        
//        System.out.print("enter another number : ");
//        int num2 = x.nextInt();
//        
//        min = (num2 < min)? num2 : min;
//        
//        System.out.print("enter another number : ");
//        int num3 = x.nextInt();
        //System.out.println("the minimum value is : " + min);
    }
}
