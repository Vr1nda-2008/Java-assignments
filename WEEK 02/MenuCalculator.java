import java.util.Scanner;

public class MenuCalculator {
    public void calcs() {
        Scanner in = new Scanner(System.in);

        int menu;
        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. exit");

            System.out.println("enter choice: ");
            menu = in.nextInt();
            if (menu == 0) {
                break;
            } 
            
                System.out.println("enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
            

            switch (menu) {
                case 1:
                    System.out.println("sum is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("subtraction is( num1 - num2) : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("multiplication is: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("division is (num1/num2): " + (num1 / num2));
                    break;

            }
            in.close();

        } while (menu == 0);

    }
}
