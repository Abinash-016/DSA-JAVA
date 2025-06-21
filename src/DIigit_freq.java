import java.util.*;
public class DIigit_freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number ");
        int a =sc.nextInt();
        System.out.println("Get the freq of which number:- ");
        int b=sc.nextInt();

        int count =0;
        int digit=0;

        while (a!=0){
            digit =a % 10;

            if (digit==b){
                count++;
            }
           a=a/10;
        }
        System.out.println("The frequency of the number "+b+" is "+count);

    }
}
