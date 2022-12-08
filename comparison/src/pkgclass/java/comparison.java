package pkgclass.java;

public class comparison {
    public static void main(String[] args){
        float num1 = 32.6f;
        int num2 = 98;
        float num3 = 9.4F;
        
        float bigger = (num1 > num2)? num1 : num2;
        
        float larger = (bigger > num3)? bigger : num3;
        System.out.println(larger);
    }
}
