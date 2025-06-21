import java.util.Scanner;
import java.io.*;
public class BarChart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many inputs");
        int a =sc.nextInt();
        int arr[]=new int [a];
        for (int i =0; i< arr.length; i++){
            System.out.println("Okay now Enter:");
            arr[i]= sc.nextInt();
        }

        int max=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Okay here is your Bar chart");
        for (int floor=max;floor>=1; floor--){
            for (int i=0; i <arr.length; i++){
                if (arr[i]>=floor){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
