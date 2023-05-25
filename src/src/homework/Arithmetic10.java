package homework;

import java.util.Scanner;

public class Arithmetic10 {
    public void addition(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc1.nextInt();
        System.out.println("Enter second number");
        int b = sc1.nextInt();
        System.out.println("Enter a operator");
        String symbol = sc1.next();
        sc1.close();
        if (symbol.equals("+")){
        System.out.println("Addition of this number is:  "+ (a+b));
    } else if (symbol.equals("-")){
            System.out.println("Subtraction of these number is: " + (a-b));
        } else if (symbol.equals("/")) {
            System.out.println("Divition of these number is: " + (a/b));
        } else if (symbol.equals("*")) {
            System.out.println("Multiplication of these number is:  " + (a*b));
        } else {
            System.out.println("Invalid Operator");
        }


    }

    public static void main(String[] args) {
        Arithmetic10 obj = new Arithmetic10();
        obj.addition();
    }
}
