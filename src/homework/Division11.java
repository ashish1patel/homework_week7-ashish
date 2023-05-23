package homework;

public class Division11 {
    public void method1() {
        System.out.println("Number divided by 3:  ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(+i + ", ");
            }
            }
        System.out.println("");
            System.out.println("Number divided by 5: ");
            for (int i = 1; i < 100; i++) {
                if (i % 5 == 0)
                    System.out.print(i + ", ");
            }

    }
        public static void main (String[]args){
            Division11 obj = new Division11();
            obj.method1();
        }

}