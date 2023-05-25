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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student Name");
        String name = input.next();
        System.out.println("Enter roll No. here");
        int rollnum = input.nextInt();
        System.out.println("Enter Maths Marks");
        int maths = input.nextInt();
        System.out.println("Enter Science Marks");
        int science = input.nextInt();
        System.out.println("Enter English Marks");
        int english = input.nextInt();
        input.close();

        if (maths > 100 && science > 100 && english > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        } else {
            int total = maths + science + english;
            double percent = percentCalc(maths, science, english);
            String result = resultCalc(percent);
            String grade = gradeCalc(percent);

            System.out.println("__________________________________");
            System.out.println("|                                |");
            System.out.println("|           Mark Sheet           |");
            System.out.println("|________________________________|");
            System.out.println("| Name      :      " + name + "|");
            System.out.println("| Roll No   :      " + rollnum + "|");
            System.out.println("|________________________________|");
            System.out.println("| Subjects  :          Marks     |");
            System.out.println("|________________________________|");
            System.out.println("| Math      :         " + maths + "   |");
            System.out.println("| Science   :         " + science + "  |");
            System.out.println("| English   :         " + english + "  |");
            System.out.println("|________________________________|");
            System.out.println("| Total     :         " + total + "|");
            System.out.println("|________________________________|");
            System.out.println("| Percentage :        " + percent + "   |");
            System.out.println("| Result     :        " + result + "|");
            System.out.println("| Grade      :        " + grade + "|");
            System.out.println("|________________________________|");
        }
    }

    public static double percentCalc(int maths, int science, int english) {
        double p1 = ((maths + science + english) * 100) / 300;
        return p1;
    }

    public static String resultCalc(double p1) {
        String result = "Fail";
        if (p1 >= 35) {
            result = "Pass";
        }
        return result;
    }

    public static String gradeCalc(double p1) {
        String grade = "N/A";
        if (p1 >= 80) {
            grade = "A+";
        } else if (p1 >= 60) {
            grade = "A";
        } else if (p1 >= 50) {
            grade = "B";
        } else if (p1 >= 35) {
            grade = "C";
        }
        return grade;
    }
}