/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evenonly;
import java.util.Scanner;
/**
 *
 * @author mahmoud
 */
public class EvenOnly {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int i = 0;
        while(i <= num){
            System.out.println(i + " is even");
            i += 2;
        }
    }
}
