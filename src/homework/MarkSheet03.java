package homework;

import java.util.Scanner;

public class MarkSheet03 {
    /**
     * a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     * _______________________________
     * | |
     * | Mark Sheet |
     * |_______________________________|
     * | Name : Jay |
     * | Roll No: 08 |
     * |_______________________________|
     * | Subjects : Marks |
     * |_______________________________|
     * | Math : 98 |
     * | Science : 90 |
     * | English : 85 |
     * |_______________________________|
     * | Total : 273 |
     * |_______________________________|
     * | Percentage : 91.0 |
     * | Result : Pass |
     * | Grade : A+ |
     * |_______________________________|
     */
    public void ms(){
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String n = sn.next();
        System.out.println("Enter Roll No: ");
        int r = sn.nextInt();
        System.out.println("Math : ");
        int m = sn.nextInt();
        if (m>100){
            System.out.println("Invalid Input");
        }else
            System.out.println("Science : ");
        int s = sn.nextInt();
        if (s>100) {
            System.out.println("Invalid Input");
        }else
            System.out.println("English : ");
        int e = sn.nextInt();
        if (e>100) {
            System.out.println("Invalid Input");
        }
        int t = m+s+e;
        int p= t/3;
        if (p >= 80) {
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    A+            |");
            System.out.println("|---------------------------------|");
        } else if (p<80 && p>=60) {
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    A             |");
            System.out.println("|---------------------------------|");

        } else if(p<60 && p>=50){
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    B             |");
            System.out.println("|---------------------------------|");
        } else if (p<50 && p>=35) {
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    C             |");
            System.out.println("|---------------------------------|");
        }

    }

    public static void main(String[] args) {
        MarkSheet03 obj =new MarkSheet03();
        obj.ms();
    }
}