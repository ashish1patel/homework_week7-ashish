package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Array17 {

    public void m() {
        Scanner scanner = new Scanner(System.in);

        // Input numeric array
        System.out.print("Enter the number of elements in the numeric array: ");
        int numSize = scanner.nextInt();
        int[] numericArray = new int[numSize];
        System.out.println("Enter the elements of the numeric array:");
        for (int i = 0; i < numSize; i++) {
            numericArray[i] = scanner.nextInt();
        }

        // Input string array
        System.out.print("Enter the number of elements in the string array: ");
        int strSize = scanner.nextInt();
        String[] stringArray = new String[strSize];
        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < strSize; i++) {
            stringArray[i] = scanner.next();
        }
        scanner.close();

        sortNumericArray(numericArray);// Sort numeric array
        sortStringArray(stringArray);// Sort string array


        System.out.println("Sorted Numeric Array:"); // Print sorted numeric array
        for (int num : numericArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print sorted string array
        System.out.println("Sorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void sortNumericArray(int[] array) {
        Arrays.sort(array);
    }

    public static void sortStringArray(String[] array) {
        Arrays.sort(array);
    }


    public static void main(String[] args) {
       Array17 obj = new Array17();
       obj.m();


    }
}