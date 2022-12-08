/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numberguessing;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class NumberGuessing {

    public static void main(String[] args) {
        //generating a random number
        Random generator = new Random();
        
        int RandomNum = generator.nextInt(100);
        
        //Scanner
        System.out.print("please enter your guess: ");
        
        Scanner reader = new Scanner(System.in);
        int guess = reader.nextInt();
        System.out.println(" ");
        
        //if statement
        if(guess == RandomNum){
            System.out.println("Correct 🎉");
        } else
        if(guess < RandomNum){
            System.out.println("your guess is less than the chosen number !");
        }else
        if(guess > RandomNum){
            System.out.println("your guess is greater than the chosen number !");
        }
        System.out.println(" ");
        
        //display chosen number
        System.out.println("the chosen number is " + RandomNum);
        System.out.println(" ");
    }
}
