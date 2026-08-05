import java.util.Scanner;

public class LeapYear {
    public static boolean leapyear(){
        boolean status = true;
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if(year%4==0 && (year%400==0  && year%100!=0)){
            System.out.println("LEAP YEAR!");
            status = true;
        }
        else{
            System.out.println("NOT A LEAP YEAR");
            status = false;
        }

        in.close();
        return status;
    }
}
