package HomeworkWeek6;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        double F,C;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Celcicus  = (F-32)*5/9");
        System.out.println(("Enter fahrenhiet in F field"));
        F=scanner.nextInt();
        C= (F-32)*5/9;
        System.out.println("Celsius Degree is"+C);



    }

}
//f+2 "degree fairnhit"