/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quadraticequations;

import java.text.DecimalFormat;
import java.util.Scanner;

//steps
        //read 3 coefficients
        //check for the equation's root and display the nature of the equations root
        //display first and second roots
        
        //problems
        //display the equation form after reciving a, b and c values and x is wirten as a String

public class QuadraticEquations {

    public static void main(String[] args) {
        
        //Scanner variable declaration
        Scanner input = new Scanner(System.in);
        
        float x = 0;
        
        System.out.print("First coefficient value: ");
        double a = input.nextFloat();
        System.out.print("Second coefficient value: ");
        double b = input.nextFloat();
        System.out.print("Third coefficient value: ");
        double c = input.nextFloat();
        
        //display form
        //float form = (float) (a * Math.pow(x, 2) + b * x + c);
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println(df.format(a) + "x^2 + " + df.format(b) + "x + " + df.format(c) + " = 0");
        
        //check for the roots
        double discriminant = Math.pow(b, 2) - 4 * a * b;
        
        if(discriminant == 0){
            System.out.println("Roots are real and equal");
        }else
        if(discriminant < 0){
            System.out.println("Roots are complex and different");
        } else
        if(discriminant > 0){
            System.out.println("Roots are real and different");
        }    

            
            
    }
}
