package even.and.odd;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    int x = number.nextInt();
    
    if(x % 2 == 0){
    System.out.println("this number is even");
}
    else {
    System.out.println("this number is odd");
}
}    }
    

