package vowelorconsonant;

import java.util.Scanner;

public class VowelOrconsonant {

    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        String y = x.nextLine();
        
        System.out.println(y);
        
        if (y.length() != 1){
            //error message
        }
        if(y = "A" || y = "a"){
            System.out.println("the character is not a vowel");
        } else {
            System.out.println("the character is vowel");
        }
    }
    
}
