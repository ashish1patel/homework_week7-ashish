package homework;
import java.util.Scanner;
public class NumAlphaSymbol12 {

    public void input(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter any Character  :  ");
        char ch = sc1.next().charAt(0);
        // sc1.close();
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + "  is a Alphabet");
        } else if (ch >='0'  && ch <='9') {
            System.out.println(ch+ "  is a Number");
        }else {
            System.out.println(ch+ " is a Symbol");
        }
    }

    public static void main(String[] args) {
NumAlphaSymbol12 obj = new NumAlphaSymbol12();
obj.input();
    }


}
