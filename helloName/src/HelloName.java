import java.util.Scanner;


public class HelloName {
    public static void main(String[] args) {
        //read
        Scanner x = new Scanner(System.in);
        
        //storage
        System.out.println("please enter your name : ");
        String name = x.nextLine();
        
        System.out.println("  ");
        
        //condition
        switch(name){
            case "yousef":
                System.out.println("hello Yousef !");
            break;
            case "mohammad":
                System.out.println("hello Mohammad !");
            break;
            case "omar":
                System.out.println("hello Omar !");
            break;
            default:
                System.out.println("access denied");
    }
    }
    }
    

