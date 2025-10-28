package Striver_AtoZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDivisorsOfNum {


    public static List<Integer> getDivisor(int n){
        List<Integer> divisors= new ArrayList<>();
        for (int i =1;i<n; i++){
            if(n%i ==0){
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to get all divisors:");
        int n=sc.nextInt();


        System.out.println(getDivisor(n));

//        List<Integer> result= getDivisor(n);
//        System.out.println(result);
//        sc.close();
    }
}
