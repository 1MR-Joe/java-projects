import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        System.out.println(" ");

        // read
        Scanner x = new Scanner(System.in);

        // storage
        System.out.print("please enter the desired year ");
        int year = x.nextInt();
        System.out.println(" ");

        // conditions
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " " + "is a leap year !");
                } else {
                    System.out.println(year + " " + "not a leap year !");
                }
            } else {
                System.out.println(year + " " + "is a leap year !");
            }
        } else {
            System.out.println(year + " " + "not a leap year !");
        }

    }
}