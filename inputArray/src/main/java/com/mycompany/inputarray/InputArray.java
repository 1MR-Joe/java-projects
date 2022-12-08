/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inputarray;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class InputArray {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("inter the array's length");
        int arr[] = new int[x.nextInt()];
        
        System.out.println("now enter the array's elements");
        
        int sum = 0;
        
        for(int i = 0; i <= arr.length; i++){
            arr[i] = x.nextInt();
            
            sum += arr[i];
        }
        
        
        System.out.println(sum);
    }
}
