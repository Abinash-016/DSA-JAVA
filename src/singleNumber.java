import java.util.Scanner;

public class singleNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n =sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+ " no of elements ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int single= findSingleNumber(arr);
        if(single!= -1){
            System.out.println("The single number in th earray is: " +single);
        }
        sc.close();
    }

    public static int findSingleNumber(int [] arr){
        for (int i =0;i<arr.length; i++){
            int count =0;
            for (int j=0 ; j< arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count==1) return arr[i];
        }
        return -1;
    }
}
