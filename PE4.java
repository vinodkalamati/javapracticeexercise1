import java.util.*;

public class PE4{
    public static void main(String args[]) {
        int number;
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        pattern(number);
    }
    public static void pattern(int number) {
        for(int i=1;i<=number;i++)
        {
            for(int j=0;j<i;j++){
                System.out.printf("%d ", i);
            }

        }
    }

}