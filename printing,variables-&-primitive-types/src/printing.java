public class printing {
    public static void main(String [] args){
        //age variables
        // ==> int myAge = 18;
        //"int" type is a primitive one, it takes 4 bytes & can store up to 2B
        //it's better to use the byte type which takes 1 byte for storing the previous variable instead of int
        byte myAge = 18;
        byte herAge = myAge;
        System.out.println(herAge);
        
        //trying primitive types(numbers, characters, booleans, etc..)
        byte small = 99;//-128 => 127
        int big = 2_123_456_789;//-2B => 2B
        long viewCount = 3_123_456_789L;//more than 2B, note the suffix
        //double price = 10.99; //takes more than needed
        float price = 10.99F;//note the suffix
        char letter = 'A';//for single letter use single quotes
        boolean isEligible = true;
    }
}
