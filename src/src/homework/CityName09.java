package homework;

import java.util.Scanner;

public class CityName09 {
    public void city() {
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter alphabet a to f");
        String a1 = alphabet.next();
        alphabet.close();
        switch (a1){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chandigadh");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Ernakulam");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
            }
        }

    public static void main(String[] args) {
        CityName09 obj = new CityName09();
        obj.city();
    }
    }




