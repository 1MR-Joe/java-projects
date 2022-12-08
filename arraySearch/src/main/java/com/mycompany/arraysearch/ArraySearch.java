/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraysearch;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class ArraySearch {

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 12, 0, 2};
        
        Scanner x = new Scanner(System.in);
        System.out.println("you have an array of 6 integers");
        System.out.print("enter a number to check if it exsist or not");
        int input = x.nextInt();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == input){
                System.out.println("the number exists at the index" + arr[i]);
                break; 
           }
        }
                System.out.println("the number is not found");
    }
}
