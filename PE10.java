import java.util.*;
public class PE10{
    public static void main(String args[]) {
        String str=new String();
        int number;
        String repeatedString="";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your String");
        str=input.nextLine();
        System.out.println("Enter Your Number");
        number=input.nextInt();
        repeatedString=str.substring(number);
        while(number>0){
            str=str+repeatedString;
            number--;
        }
        System.out.println(str);
    }
}