/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.printname;

/**
 *
 * @author mahmoud
 */
public class PrintName {
    
    public static String hello(String name){
        return "hello" + " " + name;
    }

    public static void main(String[] args) {
        String a = hello("yousef");
        
        System.out.println(a);
            
    }
}
