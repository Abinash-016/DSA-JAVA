import java.util.*;
import java.io.*;

public class Array_Span {
    public static void main(String[] args) throws Exception{

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of integer to be inserted-");
        int a= sc.nextInt();
        int arr[]=new int[a];

        for (int i=0;i< arr.length;i++){
            System.out.println("Now Enter the Integers:");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }

            if (arr[i]<min){
                min=arr[i];
            }
        }

        int span=max-min;
        System.out.println("Span ="+span);
    }
}
