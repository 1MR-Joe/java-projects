/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidvolume;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class CuboidVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("cuboid volume calculator !");
        System.out.println("inter the cuboid lenght");
        Scanner l = new Scanner(System.in);
        int length = l.nextInt();
        
        System.out.println("inter the cuboid width");
        Scanner w = new Scanner(System.in);
        int width = w.nextInt();
        
        System.out.println("inter the cuboid height");
        Scanner h = new Scanner(System.in);
        int height = h.nextInt();
        
        System.out.println(length * width * height);
    }
    
}
