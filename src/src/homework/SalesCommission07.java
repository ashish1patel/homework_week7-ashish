package homework;

import java.util.Scanner;

public class SalesCommission07 {
    public void comm() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Sales ID : ");
        int sid = sc.nextInt();
        System.out.println("Enter Seller's Name : ");
        String sn = sc.next();
        System.out.println("Enter Sales Amount: ");
        double sa = sc.nextDouble();
        double com;
        if (sa >= 50000) {
            System.out.println("Commission is: " + sa * 0.35);
        } else if (sa >= 30000) {
            System.out.println("Commission is: " + sa * 0.20);
        } else if (sa >= 20000) {
            System.out.println("Commission is: " + sa * 0.10);
        } else if (sa >= 10000) {
            System.out.println("Commission is: " + sa * 0.05);
        } else {
            System.out.println("Commission is: " + sa * 0.02);
        }
    }

    public static void main(String[] args) {
       SalesCommission07 obj = new SalesCommission07();
       obj.comm();
    }
}


