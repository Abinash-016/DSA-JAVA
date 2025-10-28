package Striver_AtoZ.recursion_New;

import java.util.Scanner;

public class PrintName {
    public static void printName(String name , int n){

        if(n==0){
            return;
        }

        System.out.println(name);
        printName(name, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name=sc.nextLine();
        System.out.println("Enter how many times you want tp repeat:");
        int n= sc.nextInt();

        printName(name,n);
    }
}
