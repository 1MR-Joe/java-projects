/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loopthrougharray;

/**
 *
 * @author mahmoud
 */
public class LoopThroughArray {

    public static void main(String[] args) {
        
        //Array
        int array[] = {4, 3, 45, 12, 64, 61, 52, 11};
        
        //variables
        int smallest = array[0];
        int largest = array[0];
        
        //comparison
        for(int i = 0; i <= array.length; i++){
            
            smallest = (array[i] < smallest)? array[i] : smallest;
            
            largest = (array[i] > largest)? array[i] : largest;
            
            
            
//            if(array[i] < smallest){
//                smallest = array[i];
//            } else
//            if(array[i] > largest){
//                largest = array[i];
//            }
        }
        
    }
}
