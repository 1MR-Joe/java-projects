package com.mycompany.makearray;

import java.util.Arrays;
import java.util.Scanner;

public class MakeArray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        
        System.out.println("you have an array of 5 elements please fill it");
        System.out.print("how meny elements you're going to fill ? : ");

        Scanner x = new Scanner(System.in);
        int num = (int) x.nextInt();
        
        for(int i = 1; i <= num; i++){
        System.out.print("enter the number of the element you're changing : ");
        int elem = (int) x.nextInt() - 1;
        
        System.out.print("now enter it's value : ");
        int value = (int) x.nextInt();
        
        arr[elem] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
}
