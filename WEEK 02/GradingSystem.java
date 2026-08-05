import java.util.Scanner;

public class GradingSystem {
    public void GS() 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = in.nextInt();
        if(marks<=100 && marks>=80)
            System.out.println("Distinction");
        else if(marks<80 && marks>=70)
            System.out.println("Merit");
        else if(marks<70 && marks>=50)
            System.out.println("Pass");
        else if(marks<50 && marks>=0)
            System.out.println("Fail");
        else
            System.out.println("Invaild");
       
        in.close();
    } 
}
