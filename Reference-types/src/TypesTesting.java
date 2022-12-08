
import java.util.Date;

import java.awt.Point;

import java.lang.*;
import java.util.Arrays;

public class TypesTesting {
    public static void main(String [] args){
        //reference types     
        Date now = new Date();
        System.out.println(now);
        
        //reference vs primitive types
//        Point point1 = new Point(x: 1, y:1);
        //point point2 = point1;
        //point2 just saves the address of point1
        
        //[________________strings__________________]
        System.out.println("[____strings____]");
        
        String message = "hello world!!*";
        System.out.println(message);
        //collecting some info about the string !
        System.out.println(message.length());
        System.out.println(message.indexOf("h"));
        //remember: we start counting from zero !!
        System.out.println(message.indexOf("!"));
        //how to get the indexOf(second "!")????
        
        //check this out !
        System.out.println(message.indexOf("z"));
        
        System.out.println(message.replace("*", "!"));
        //in java stings are immutable
        //always a new strings will be returned
        
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        
        String text = "        hello wide world !        ";
        System.out.println(text);
        System.out.println(text.trim());
        
        //parameters & arguments
        //parameters: holes we define in out methods
        //arguments: the values we pass for methods(filling holes)
        
        
        //[_____________Escape sequences______________]
        System.out.println("[____Escape sequences____]");
        
        //1. adding quotations in our string
        //      \"quoted word\"
        String greetings = "hello \"alex\"";
        System.out.println(greetings);
        
        //2. adding back slashes to our strings
        String path = "c:\\windows\\desktop\\";
        System.out.println(path.toUpperCase());
        
        //3. adding a new line to our string
        String speech = "welcome everybody\nI'm happy to inform you that .......";
        System.out.println(speech);
        
        //4. adding a tab in our string
        String essay = "\t I'm starting my essay with ....";
        System.out.println(essay);
        
        
        //[_____________Arrays  ______________]
        System.out.println("[____Arrays____]");
        
        //we have 2 ways to define arrays
        //1. the older way
        int[] numArray = new int[5];
        numArray[0] = 1;
        numArray[1] = 2;
        numArray[2] = 3;
       System.out.println(numArray);
       //we have to convert the array into a string !!
       //Arrays.toString(numArray)
       System.out.println(Arrays.toString(numArray));
       //arrays items initialization:
       //intger arrays => zero
       //boolean arrays => false
       //string arrays => empty string
       
       
       //2.
       int[] otherArray = { 1, 2, 3, 4, 5};//if we knew the items in advance
       System.out.println(otherArray.length);
       
       //sorting our array
       Arrays.sort(otherArray);
       System.out.println(Arrays.toString(otherArray));
       //arrays has fixed length (for now)
       
       //[_____________mutli-dimensional-arrays______________]
       System.out.println("[____multi-dimensinal-arrays____]");
       
       //1. the old way
       int[][] matrix = new int[3][3];
       matrix[0][0] = 1;
       matrix[1][1] = 1;
       matrix[2][2] = 1;
       
       //let's see the result
       System.out.println(Arrays.toString(matrix));// oh error
       
       //check this out
       System.out.println(Arrays.deepToString(matrix));
       //now we can see the results
       //I created a diagonal matrix, nice !
       
       //2. the curly brackets way
       int[][] matrix2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
       System.out.println("diagonal matrix with the curly brackets way");
       System.out.println(Arrays.deepToString(matrix2));
       
       //[_____________constants____________]
       System.out.println("[____constants____]");
       
       //how to assign constants in java like "const" in javascript ??
       //use the work "final" before the type declaration
       final float PI = 3.14F;
       
       //PI = 1; //activate this line and see what happens
       
       //it's a practice to name any constant with capital letters !
    }
       
    
}
