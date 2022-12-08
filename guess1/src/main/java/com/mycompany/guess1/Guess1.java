/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guess1;

import java.util.*;

//make a random number
//print instructions
//take a guess
//check for a match
// match => congrats message
// no match => try again message (requres looping)+ tell the number of trials left (random number not chaged)



public class Guess1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Random y = new Random();
        int random = y.nextInt(10) + 1;
        //System.out.println(random); //comment me !
        int i = 1;
        int guess = 0;
        System.out.println("[_______________GUESSING GAME_______________]");
        System.out.println("A random number is generated between 1 & 10, you have 5 trials to guess what it is ?");
        
        for (; i <=5; i++){
            System.out.println("trial " + i);
            System.out.print("please make a guess : ");
            guess = x.nextInt();
            
            if(guess == random){
            System.out.println("congrats you made the righ guess");
            break;
            }else if(i < 5){
            System.out.println("sadly you made a wrong guess, try again");
            }
        }
        //System.out.println("the value of i is " + i);
        if(i == 6 && random != guess){
            System.out.println("Sadly you're out of trails :(");
        }
    }
}
