/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dowhile;

/**
 *
 * @author mahmoud
 */
public class DoWhile {

    public static void main(String[] args) {
        int i = 1;
        
        
        while(i > 2){
            System.out.println("i =" + i);
        }
        
        
        do{
            System.out.println("done by /'do/'");
            i++;
        }
        while(i > 2);
    }
}
