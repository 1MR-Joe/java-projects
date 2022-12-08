package pkgclass.java;


public class ascendingOrdescending {
    public static void main(String[] args){
        int num1 = 1524;
        int num2 = 2345;
        int num3 = 3321;
        
        if (num3 > num2 && num2 > num1){
            System.out.println("numbers are ascending");
        } else if(num1 > num2 && num2 > num3){
            System.out.println("numbers are descending");
        }
    }
}
