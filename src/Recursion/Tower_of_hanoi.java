package Recursion;
import java.util.Scanner;

public class Tower_of_hanoi {
    public static void towerOfhanoi(int n , String source,String helper, String destination){
        if (n==1){
            System.out.println("Transfer disk "+n+"from"+source+"to "+destination);
            return;
        }

        towerOfhanoi(n-1,source,destination,helper);
        System.out.println("Transfer disk "+n+" from"+source+" to "+destination);
        towerOfhanoi(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        towerOfhanoi(n,"S","H","D");
    }
}
