/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mathhhhh;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class Mathhhhh {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("please enter two integers");
        int num1 = x.nextInt();
        int num2 = x.nextInt();
        
        System.out.println("the max number is " + Math.max(num1, num2));
        System.out.println("the square root of the max number is " + Math.sqrt(Math.max(num1, num2)));
        System.out.println("the max power min " + Math.pow(Math.max(num1, num2), Math.min(num1, num2)));

    }
}
