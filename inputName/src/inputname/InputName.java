/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputname;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class InputName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter your name !");
        Scanner x = new Scanner(System.in);
        String name = x.nextLine();
        System.out.println("hello" + " " + name);
    }
    
}
