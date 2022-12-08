/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //read
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        
        //storage
        System.out.println("please enter the desired operation !");
        String operator = x.nextLine();
        
        System.out.println("enter the first number");
        int num1 = y.nextInt();
        
        System.out.println("enter the second number");
        int num2 = z.nextInt();
        
        System.out.println(num1 + operator + num2);
        
        //switch
        switch(operator){
            case "+":
                System.out.printf("the outcome = %d",num1 + num2);
            break;
            case "-":
                System.out.printf("the outcome = %d", num1 - num2);
            break;
            case "*":
                System.out.printf("the outcome = %d", num1 * num2);
            break;
            case "/":
                System.out.printf("the outcome = %d", num1 / num2);
            break;
        }
        
        //error: not expecting the persence of decimal numbers
        
        
    }
    
}
