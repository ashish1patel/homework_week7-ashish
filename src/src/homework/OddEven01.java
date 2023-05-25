package homework;

import java.util.Scanner;

public class OddEven01 {
    /**
     * a java program that tells us that Input number is odd or even?
     */
    public void oddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int x = sc.nextInt();
        System.out.println(!(x % 2 == 0) ? "Odd Number" : "Even Number");
    }
    public static void main(String[] args) {
        OddEven01 obj = new OddEven01();
        obj.oddEven();
    }
}
