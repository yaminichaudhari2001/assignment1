public class Main {
    static int a=10;
    static int b=20;

    static void add()
    {
        int c=a+b;
        System.out.println("this is addition"+c);
    }
    static void sub()
    {
        int d=a-b;
        System.out.println("this is subtraction"+d);
    }
    static void mul()
    {
        int e=a*b;
        System.out.println("this is multiplication"+e);
    }
    static void div()
    {
        int f=a/b;
        System.out.println("this is division"+f);
    }
    static {
        System.out.println("Change the value get calculation again and again");
    }
    public static void main(String[] args) {
        System.out.println("Calculation");
        add();
        sub();
        mul();
        div();
    }
}