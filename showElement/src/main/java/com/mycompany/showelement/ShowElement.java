/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.showelement;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class ShowElement {

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 1, 7, 4};
        
        String y = "y";
        
        String entry = null;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("you have an array of 6 elements");
        
        do{
            System.out.print("type the element's number to show it's value : ");
            int num = Integer.parseInt(x.nextLine()) - 1;
            
            System.out.println("the elements value is : " + arr[num]);
            
            System.out.println("do you wish to continue ?");
            System.out.print("if yes type \"y\" it not type any thing else : ");
            entry = (String) x.nextLine();
            

        }while(entry.equals(y));
        
        //show an element
        //ask if continue ?
        //make a conditional for y and n (switch)
        //if yes => ask again
        //if no => break out
        
        //do while loop
        //do => ask
        //while => value is true
    }
}
