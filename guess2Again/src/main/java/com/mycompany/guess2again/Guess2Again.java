/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guess2again;
import java.util.*;

//possible outcomes : 
//all wrong
//right in the middle
//right at the last trial

public class Guess2Again {

    public static void main(String[] args) {
        System.out.println("[_______________GUESSING GAME_______________]");
        System.out.println("welcome to the second level");
        System.out.println("the game is the same, only one change is made.");
        System.out.println("make a wrong guess and your target is changed !!");
        
        Scanner x = new Scanner(System.in);
        Random y = new Random();
        int i = 1;
        int guess = 0;
        int random = 0;
        
        for (; i <=5; i++){
            random = y.nextInt(10) + 1;
            //System.out.println("the random number is : " + random);

            System.out.println("trial " + i);
            System.out.print("make a guess : ");
            guess = x.nextInt();
            
            if(guess == random){
            System.out.println("congrats you made a correct guess");
            break;
            }else if(i < 5){
            System.out.println("sadly you made a wrong guess, try again");
            }
        }
        //System.out.println("the value of i is " + i);
        if(i == 6 && guess != random){
            System.out.println("Sadly you're out of trails :(");
        }
    }
}
