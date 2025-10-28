package Striver_AtoZ;

import java.util.Scanner;

public class ArmstrongNum {

    public static int cube(int n){
        return n*n*n;
    }

    public static boolean isArmstrong(int num){
        int original= num;
        int sum = 0;

        while(num>0) {
            int digit = num % 10;
            sum += cube(digit);
            num /= 10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to check:");

        int number =sc.nextInt();
        boolean res=isArmstrong(number);
        System.out.println(res);

        sc.close();
    }
}
