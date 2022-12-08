/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maxinarray;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class MaxInArray {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("enter the array's length: ");
        int[] arr = new int[x.nextInt()];
        
        int large = 0;
        
        System.out.println("now enter the array's elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = x.nextInt();
            
            large = (large < arr[i])? arr[i] : large;
        }
        
        System.out.println("The largest number is " + large);
    }
}
