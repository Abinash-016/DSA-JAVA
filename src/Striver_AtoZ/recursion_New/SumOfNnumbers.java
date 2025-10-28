package Striver_AtoZ.recursion_New;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth value");
        int n =sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }

    static int sum(int n){
        if(n==0) {return 0;}

        return n+ sum(n-1);
    }
}
