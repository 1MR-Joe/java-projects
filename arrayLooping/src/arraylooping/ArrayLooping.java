/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylooping;

/**
 *
 * @author mahmoud
 */
public class ArrayLooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array
        int nums[] = {4, 3, 45, 12, 64, 61, 52, 11};
        
        //variables
        int smallest = nums[0];
        int largest = nums[0];
        
        //comparison
        for(int i = 0; i <= nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
    }
    
}
