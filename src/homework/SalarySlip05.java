package homework;

import java.util.Scanner;

public class SalarySlip05 {
    public void wap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int ei= sc.nextInt();
        System.out.println("Employee Name");
        String en= sc.next();
        System.out.println("Enter Basic Salary : ");
        int bs= sc.nextInt();
        double hra=bs*0.10;
        double da= bs*0.08;
        double ta= bs*0.09;
        double pf= bs*0.20;
        double gs= bs+hra+ta+da-pf;
        sc.close();
        System.out.println("|------------------------|");
        System.out.println("|      Salary Slip       |");
        System.out.println("|------------------------|");
        System.out.println("|Employee ID   : " +ei+ "|");
        System.out.println("|Employee Name : " +en+ "|");
        System.out.println("|------------------------|");
        System.out.println("|Basic Salary : " +bs+"  |");
        System.out.println("|HRA 10%      : " +hra+ "|");
        System.out.println("|TA 8%        : " +ta+ " |");
        System.out.println("|DA 9%        : " +da+ " |");
        System.out.println("|PF 20%       : " +pf+ " |");
        System.out.println("|------------------------|");
        System.out.println("|Gross Salary : " +gs+ " |");
        System.out.println("|========================|");
    }

    public static void main(String[] args) {
      SalarySlip05 obj = new SalarySlip05();
      obj.wap();

    }
}

