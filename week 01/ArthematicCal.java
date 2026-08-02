import java.util.Scanner; //importing scanner class for taking input from user

public class ArthematicCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //taking input from user
        System.out.println("enter first numbers: ");
        int a = input.nextInt(); //taking input from user
        System.out.println("enter second number: ");
        int b = input.nextInt();

        //calculating sum, difference, product, quotient and remainder
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        //displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        input.close(); //closing the scanner
    }
    
}
