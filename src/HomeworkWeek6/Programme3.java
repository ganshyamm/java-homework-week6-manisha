package HomeworkWeek6;
//one instance and one static

public class Programme3 {
    int a=10;
    static int b=20;

    public static void main(String[] args){

        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(obj.b);
        pencil();
        obj.myMethod();


    }
    public void myMethod(){
        System.out.println(a);

    }
    public static void pencil(){
        System.out.println(Programme3.b);





    }

}
