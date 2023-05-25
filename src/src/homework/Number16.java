package homework;

import java.util.Scanner;

public class Number16 {
        public void number() {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter any Number  :  ");
            int a = sc1.nextInt();
            // sc1.close();
            if (a > 0) {
                System.out.println(a + "  is a POSITIVE");
            } else if (a < 0) {
                System.out.println(a + "  is NEGATIVE");
            } else {
                System.out.println(a + " is a ZERO");
            }
        }
        public static void main(String[] args) {
            Number16 obj = new Number16();
            obj.number();
        }
    }
