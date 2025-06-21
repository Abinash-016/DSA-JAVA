package Recursion;

import java.util.Scanner;

public class stringReverse {
    public static void printREv(String str,int idx){
        if (idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printREv(str,idx-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to do the reverse: ");
        String str=sc.nextLine();
        printREv(str,str.length()-1 );
    }
}
