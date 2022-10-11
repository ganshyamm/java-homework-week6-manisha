package HomeworkWeek6;

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        double radius, area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius value");
        radius = scan.nextInt();
        area = Math.PI * radius * radius;
        System.out.println("Area of the circle is" + area);






    }
}
