package homework;

import java.util.Scanner;

public class Week13 {
    public void week() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter any Number");
        int day = sc1.nextInt();
        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Week contains 1 to 7 days";
        } return dayName;
    }
    public static void main (String[]args){
        Week13 obj = new Week13();
        obj.week();
    }

}

