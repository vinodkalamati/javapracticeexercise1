import java.util.*;
public class PE8{
    public static void main(String args[]) {
        int number;
        int targetnumber=35;
        System.out.println("Enter the number in the limit 1-50");
        Scanner input=new Scanner(System.in);
        while(true){
            number=input.nextInt();
            
            if(number>targetnumber){
                System.out.printf("Number guessed is more than original number");
                System.out.println();
                System.out.println("enter number once again");
            }
            else if(number<targetnumber){
                System.out.printf("Number guessed is less than original number");
                System.out.println();
                System.out.println("enter number once again");
            }
            else if(number==targetnumber){
                System.out.printf("Number guessed matches the original number");
                break;
            }

        }
        
    }
}