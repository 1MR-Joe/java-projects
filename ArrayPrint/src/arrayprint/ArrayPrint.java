/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprint;

/**
 *
 * @author mahmoud
 */
public class ArrayPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = new int[5];
        x[0] = 12;
        x[1] = 20;
        x[2] = 11;
        x[3] = 65;
        x[4] = 9;
        
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
        
        
        int min = 0;
        
        if(x.length > 1){
            for(int i = 1; i <= x.length; i++){
                min = (x[i] > x[i - 1])? x[i] : x[i - 1];
            }
        }else {
            min = x[0];
        }
    }
    
}
