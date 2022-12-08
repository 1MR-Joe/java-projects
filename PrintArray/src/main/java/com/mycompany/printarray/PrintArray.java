/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.printarray;

/**
 *
 * @author mahmoud
 */
public class PrintArray {

    public static void main(String[] args) {
        int[] x = new int[5];
        x[0] = 12;
        x[1] = 20;
        x[2] = 11;
        x[3] = 65;
        x[4] = 9;
        
        for(int i = 0; i >= 0; i--){
            System.out.println(x[i]);
        }
    }
}
