/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumavg;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class SumAvg {

    public static void main(String[] args) {
        
        //Scanner
        Scanner x = new Scanner(System.in);
        
        float num1 = x.nextInt();
        float num2 = x.nextInt();
        float num3 = x.nextInt();
        float num4 = x.nextInt();
        float num5 = x.nextInt();
        
        
        //calculations
        float sum = num1 + num2 + num3 + num4 + num5;
        
        float avg = (num1 + num2 + num3 + num4 + num5) / 5;
        
        System.out.println("the sum of numbers you entered : " + sum);
        System.out.println("the average of numbers you entered : " + avg);
    }
}
