import java.util.*;

public class PE2{
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number:");
        number=input.nextInt();

        if(number>20 && number<30)
        {
            if(number%2==0)
            {
                System.out.println("Tom");
            } 
            else if(number%2!=0)
            {
                System.out.println("Jerry");
            }
        }
        else
        {
            System.out.println("failure");
        }
    }
}