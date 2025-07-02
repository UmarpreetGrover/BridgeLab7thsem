//import java.util.Scanner;
//
//public class Calculator2 {
//
//    int a, b;
//
//    public void methodAdd(){
//        int valueA = a;
//        int valueB = b;
//        int result = a + b;
//        System.out.println(result);
//    }
//
//    public void methodSubtract(){
//        int valueA = a;
//        int valueB = b;
//        int result = a - b;
//        System.out.println(result);
//    }
//
//    public void methodMultiply(){
//        int valueA = a;
//        int valueB = b;
//        int result = a * b;
//        System.out.println(result);
//    }
//
//    public void methodDivision(){
//        int valueA = a;
//        int valueB = b;
//        int result = a / b;
//        System.out.println(result);
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first value: ");
//        int valueA = sc.nextInt();
//        System.out.println("Enter second value: ");
//        int valueB = sc.nextInt();
//
//        Calculator2 obj = new Calculator2();
//
//        obj.a = valueA;
//        obj.b = valueB;
//
//        obj.methodAdd();
//        obj.methodSubtract();
//        obj.methodMultiply();
//        obj.methodDivision();
//    }
//}
import java.util.Scanner;

public class Calculator2 {

    float a, b; 
    public void methodAdd(){
        float valueA = a;
        float valueB = b;
        float floatResult = a + b;
        System.out.println("Float: "+floatResult);
    }

    public void methodSubtract(){
        float valueA = a;
        float valueB = b;
        float floatResult = a - b;
        System.out.println("Float: "+floatResult);
    }

    public void methodMultiply(){
        float valueA = a;
        float valueB = b;
        float floatResult = a * b;
        System.out.println("Float: "+floatResult);
    }

    public void methodDivision(){
        float valueA = a;
        float valueB = b;
        float floatResult = a / b;
        System.out.println("Float: "+floatResult);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        float valueA = sc.nextFloat();
        System.out.println("Enter second value: ");
        float valueB = sc.nextFloat();

        Calculator2 obj = new Calculator2();

        obj.a = valueA;
        obj.b = valueB;

        obj.methodAdd();
        obj.methodSubtract();
        obj.methodMultiply();
        obj.methodDivision();
    }
}