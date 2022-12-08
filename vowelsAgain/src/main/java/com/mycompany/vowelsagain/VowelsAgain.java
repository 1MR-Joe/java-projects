/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vowelsagain;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class VowelsAgain {

    public static void main(String[] args) {
        //Scanner
        Scanner x = new Scanner(System.in);
        
        char input = x.nextLine().charAt(0);
        
        //comparison
        switch(input){
            case 'A':
                System.out.println("vowel");
            break;
            case 'a':
                System.out.println("vowel");
            break;
            case 'U':
                System.out.println("vowel");
            break;
            case 'u':
                System.out.println("vowel");
            break;
            case 'I':
                System.out.println("vowel");
            break;
            case 'i':
                System.out.println("vowel");
            break;
            case 'O':
                System.out.println("vowel");
            break;
            case 'o':
                System.out.println("vowel");
            break;
            case 'E':
                System.out.println("vowel");
            break;
            case 'e':
                System.out.println("vowel");
            break;
            default:
                System.out.println("consonant");
            break;
        }
    }
}
