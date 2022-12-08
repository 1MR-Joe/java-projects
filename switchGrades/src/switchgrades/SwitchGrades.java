
package switchgrades;

import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class SwitchGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("input your score (90, 80, 70, 60)");
        
        Scanner x = new Scanner(System.in);
        // new == create object
        
        int score = x.nextInt();
        
        switch(score){
            case 90 :
                System.out.println("A");
                break;
            case 80 :
                System.out.println("B");
                break;
            case 70 :
                System.out.println("C");
                break;
            case 60 :
                System.out.println("D");
                break;
                
            default:
                System.out.println("F");
        }
    }
    
}
