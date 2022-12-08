/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arithmetic;

/**
 *
 * @author mahmoud
 */
public class Arithmetic {

    public static void main(String[] args) {
        //ARITHMETIC EXPRISSIONS
        // => exprission: a piece of code that produces a value;
        
        int result = 10 / 3;
        System.out.println(result);
        
        double correctResult = (double)10 / (double)3;
        System.out.println(correctResult);
        
        int x = 1;
        
        int y = ++x;
        int z = x++;
        
        x += 2; //same as X = x + 2;
        //the same with other operators
        
        //ORDER OF OPERATORS
        //()
        // * and /
        // + and -
        
        //CASTING
        
        // => implicit casting (automatic casting)
        // : happenes when From (data type) to (bigger in byte data type)
        //it happens when there is no chance for data loss 
        // byte => short => int => long => float => double
    }
}
