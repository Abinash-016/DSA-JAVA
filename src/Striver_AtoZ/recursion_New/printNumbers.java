package Striver_AtoZ.recursion_New;

import java.util.Scanner;
//
//public class printNumbers {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the nth value");
//        int n =sc.nextInt();
//        num(1,n);
//        sc.close();
//    }
//    static void num(int curr, int n){
//        if(curr>n) return;
//
//        System.out.println(curr);
//        num(curr+1,n);
//
//    }
//}



// N TO 1


public class printNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth value");
        int n =sc.nextInt();
        num(n);
        sc.close();
    }
    static void num(int n){
        if(n==0) return;

        System.out.println(n);
        num(n-1);

    }
}
