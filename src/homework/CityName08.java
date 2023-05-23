package homework;

import java.util.Scanner;

public class CityName08 {
    public void city(){
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter alphabet a to f");
        String a1 = alphabet.next();
        alphabet.close();
        if (a1.equals("A")) {
            System.out.println("Ahmedabad");
        } else if (a1.equals("B")){
            System.out.println("Baroda");
        } else if (a1.equals("C")) {
            System.out.println("Chandigadh");
        } else if (a1.equals("D")){
            System.out.println("Delhi");
        } else if (a1.equals("E")){
            System.out.println("Ernakulam");
        } else if (a1.equals("F")) {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {
        CityName08 obj = new CityName08();
        obj.city();
    }
}
