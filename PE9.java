import java.util.*;
public class PE9{
    public static void main(String args[]) {
        String str=new String();
        System.out.println("enter the string");
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        String reverse_string="";

        for(int i=str.length()-1;i>=0;i--){
            reverse_string=reverse_string+str.charAt(i);
        }
        System.out.println("reversed string is  "+reverse_string);
    }
}