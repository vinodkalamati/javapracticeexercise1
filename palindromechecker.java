import java.util.*;
import java.lang.*;

public class palindromechecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        palindrome(number);

    }

    public static void palindrome(int number) {
        int number2 = number;
        ArrayList temp = new ArrayList();
        // reversing and storing digits in a arraylist
        for (int i = 0; number2 > 0; i++) {
            temp.add(number2 % 10);
            number2 = number2 / 10;
            System.out.println(temp.get(i));
        }
        System.out.println(temp.size());
        int count=0;
        int even_sum=0;
        for(int i=0,j=temp.size()-1;i<=(temp.size()/2);i++,j--)
        {   
            if(temp.get(i)!=temp.get(j))
            {
                System.out.println("it is not a palindrome");
                count++;
                break;
                
            }
           
         }
        if(count==0){
            for(int i=0;i<temp.size();i++)
            {   int temp1=(int)temp.get(i);
                if(temp1%2==0){
                    even_sum=temp1 + even_sum;
                }
            }
            if(even_sum>25)
            {
                System.out.printf("%d is a palindrome and the sum of even numbers is greater than 25",number);
                System.out.println();
            }
            else{
                System.out.printf("%d is a palindrome and the sum of even numbers is less than 25",number);
                System.out.println();

            }
        }

    }
}