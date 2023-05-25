package homework;

import java.util.Scanner;

public class SumValue18 {
    public void smu(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        int size = sc1.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            myArray[i] = sc1.nextInt();
            sum = sum + myArray[i];
        }
        sc1.close();
        System.out.println("Sum of the elements of the array :"+sum);
    }
    public static void main(String args[]){
        SumValue18 obj = new SumValue18();
        obj.smu();
    }
}


