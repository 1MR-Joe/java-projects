import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        //read
        Scanner input1  = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        //storage
        System.out.println("enter the first number, please");
        int x = input1.nextInt();

        System.out.println("now enter the second number");
        int y = input2.nextInt();
        
        //print
        int sum = x + y;
        System.out.println("  ");
        System.out.println("the sum of x and y are:" + " " + sum);
    }
    
}
