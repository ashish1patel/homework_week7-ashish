package homework;

import java.util.Scanner;

public class Calculate19 {
    public void smu(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        int size = sc1.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        int avg = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            myArray[i] = sc1.nextInt();
            sum = sum + myArray[i];
            avg = sum/size;
        }
        sc1.close();
        System.out.println("Average value of the elements of the array :"+avg);
    }
    public static void main(String args[]){
      Calculate19 obj = new Calculate19();
        obj.smu();
    }
}



