import java.util.*;

public class PE5{
    public static void main(String args[]) {
        int n,number,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of integers");
        n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            number=input.nextInt();
            if(number%2==0 || number%2!=0){
                sum=sum+number;
            }
            else{
                System.out.println("error");
            }

        }
        System.out.println(sum);
    }
}