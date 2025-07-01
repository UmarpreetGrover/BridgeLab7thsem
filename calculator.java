
import java.util.Scanner;
public class calculator {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a,int b) {
        return a-b;
    }
    public static int multiply(int a,int b) {
        return a*b;
    }
    public static double divide(int a,int b) {
        if (b ==0) {
            System.out.println("error");
            return 0;
        }
        return (double)a/b;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first  number :");
        int a = sc.nextInt();

        System.out.println("Enter second  number:");
        int b  = sc.nextInt();



        System.out.println("Add: " + add(a, b));
        System.out.println("subtract: " + subtract(a,b));
        System.out.println("multiply:" + multiply(a,b));
        System.out.println("Division:" + divide(a,b));
    }
}
