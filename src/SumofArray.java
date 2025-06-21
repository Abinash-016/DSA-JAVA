import java.util.Scanner;
import java.io.*;

public class SumofArray {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int arr1[]=new int [a1];
        for (int i=0; i< arr1.length; i++){
            arr1[i]=sc.nextInt();
        }

        int a2=sc.nextInt();
        int arr2[]=new int [a2];
        for (int i=0; i< arr2.length; i++){
            arr2[i]=sc.nextInt();
        }

        int maxSize = Math.max(a1, a2);
        int[] sumArray = new int[maxSize];

        // Add elements of both arrays
        for (int i = 0; i < maxSize; i++) {
            int val1 = (i <a1) ? arr1[i] : 0; // Use 0 if index exceeds arr1 size
            int val2 = (i < a2) ? arr2[i] : 0; // Use 0 if index exceeds arr2 size
            sumArray[i] = val1 + val2;
        }

        // Print the sum array
        System.out.println("The sum of the two arrays is:");
        for (int val : sumArray) {
            System.out.print(val + " ");
        }

    }
}
