package assignments;

public class areaPerimeter {
    public static void main(String[] args) {
        //[________________measurements__________________]
        int length = 10;
        int width = 4;
        int height = 10; //trapezium
        int base = 4;//parallelogram & triangle
        int d1 = 2, d2 = 5;//Rhombus
        int radius = 3;//circule
        
        //triangle sides (perimeter)
        int s1 = 4;
        int s2 = 4;
        int s3 = 5;
        
        //trapezium-sides
        int trapeziumTop = 3;
        int trapeziumBase = 6;
        int trapeziumRight = 4;
        int trapeziumLeft = 5;

        System.out.println("[___________AREA____________]");
        System.out.println((width * width) + " " + "square");
        System.out.println((length * width) + " " + "rectangle");
        System.out.println((base * height) + " " + "parallelogram");
        System.out.println((0.5 * d1 * d2) + " " + "Rhombus");
        System.out.println((Math.PI * (radius * radius)) + " " + "circle");
        System.out.println((0.5 * (base * height)) + " " + "triangle");
        System.out.println((((trapeziumTop + trapeziumBase) / 2) * height) + " " + "trapezium");
        
        System.out.println("[___________PERIMETER____________]");
        System.out.println(4 * length + " " + "square");//square
        System.out.println((2 * (length + width) + " " + "rectangle"));
        System.out.println((2 * (length + width)) + " " + "parallelogram");
        System.out.println((2 * (length + width)) + " " + "Rhombus");
        System.out.println(2 * Math.PI * radius + " " + "circle");
        System.out.println((s1 + s2 + s3) + " " + "triangle");
        System.out.println((trapeziumTop + trapeziumBase + trapeziumRight + trapeziumLeft) + " " + "trapezium");
    
        
        System.out.println("يوسف محمود محمد شحاتة");
        
    }
    
}
