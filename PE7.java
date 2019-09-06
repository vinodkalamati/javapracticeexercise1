import java.util.*;
public class PE7{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int number = input.nextInt();
        nonincreasingorder(number);

    }

    public static void nonincreasingorder(int number) {
        int number2 = number;
        int even_sum=0;
        ArrayList temp = new ArrayList();
        for (int i = 0; number2 > 0; i++) {
            temp.add(number2 % 10);
            number2 = number2 / 10;
        }
        Collections.sort(temp,Collections.reverseOrder());
        
        for(int i=0;i<temp.size();i++)
        {   int temp1=(int)temp.get(i);
            if(temp1%2==0){
                even_sum=temp1 + even_sum;
            }
        }
        int desc=0;
        for(int i=0;i<temp.size();i++){
            int temp2=(int)temp.get(i);
            desc=desc*10+temp2;            

        }
            System.out.printf("Sorted number in non-increasing order :%d", desc);
            System.out.println();
            System.out.printf("sum of even numbers:%d",even_sum);
            System.out.println();
            if(even_sum>15){
                System.out.println("True");
            }
            else{
                System.out.println("false");
            }
    }

}