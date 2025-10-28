package Striver_AtoZ.Recursion;
import java.util.Scanner;

public class recursion3 {
    public static int calcfactorial(int n ){
        if (n==1||n==0){
            return 1;
        }

       int fact_nm1= calcfactorial(n-1);
       int fact_n= n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();

        int ans =calcfactorial(n);
        System.out.println("The factorial of "+n +" is "+ ans);
        sc.close();
    }
}
