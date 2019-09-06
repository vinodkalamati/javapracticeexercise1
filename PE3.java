import java.util.*;

public class PE3{
    public static void main(String[] args) {

        String str=new String();
        System.out.println("enter your word");
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        if(str.charAt(0)>='A' && str.charAt(0)<='Z'){
            System.out.println("please enter letter");
        }
        checkstring(str);
     }
     public static void checkstring(String str) {
         
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.printf("Vowel ");
            }
            else{
                System.out.printf("Consonant ");
            }
        }
     }
}