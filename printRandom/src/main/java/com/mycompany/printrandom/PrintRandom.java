/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.printrandom;

import java.util.*;
/**
 *
 * @author mahmoud
 */
public class PrintRandom {

    public static void main(String[] args) {
        Random x = new Random();
        
        for(int i = 1; i <= 10; i++){
            int num = x.nextInt(11);
            System.out.println(num);
        }
    }
}
