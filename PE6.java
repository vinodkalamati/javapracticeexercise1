import java.util.*;
public class PE6{
    public static void main(String args[]) {
        char a;
        System.out.println("enter your character");
        Scanner input=new Scanner(System.in);
        a=input.next().charAt(0);
        boolean b1,b2,b3,b4;
        b1=Character.isUpperCase(a);
        b2=Character.isLowerCase(a);
        b3=Character.isDigit(a);
        b4=Character.isWhitespace(a);
        if(b1){
            System.out.println("Capital letter");
        }
        else if(b2){
            System.out.println("small letter");
        }
        else if(b3){
            System.out.println("Digit");
        }
        else if(!b4){
            System.out.println("Special character");
        }
    }
}