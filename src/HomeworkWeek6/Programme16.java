package HomeworkWeek6;

import java.util.Scanner;

//Write a Java program to add two binary numbers.
public class Programme16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st binary number:");
        String x = s.next();//10
        System.out.println("Enter 2nd binary number");
        String y = s.next();//11

        int b1 =Integer.parseInt(x, 2);
        int b2 =Integer.parseInt(y,  2);
        int b3 =b1+b2;
        System.out.println("b1:"+Integer.toBinaryString(b1));
        System.out.println("b2:"+Integer.toBinaryString(b2));
        System.out.println("b3=b1+b2 :"+Integer.toBinaryString(b3));

    }

}