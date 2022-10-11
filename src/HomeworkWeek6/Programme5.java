package HomeworkWeek6;
// write a program for calculator, add,sub,muliplication, and division method all with use string concatenation method

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Programme5 {

     static public void main(String[] args){
          int p1,p2,p3, op;
          Scanner adj = new Scanner((System.in));
          System.out.println(("Input the First number"));
          p1 = adj.nextInt();
          System.out.println("Input the second number");
          p2 = adj.nextInt();

          System.out.println("option Available");
          System.out.println("addition");
          System.out.println("substraction");
          System.out.println("multiplication");
          System.out.println("division");
          System.out.println("Enter option");

          //1
          p3 = p1 + p2;
          System.out.println("addition=" + p3);
          //2
          p3 = p1 - p2;
          System.out.println("Substraction=" + p3);
          //3
          p3 = p1 * p2;
          System.out.println("multiplication=" + p3);
          //4
          p3 = p1 / p2;
          System.out.println("Division=" + p3);
          //any number:
          System.out.println("any option");
          adj.close();








     }


}
