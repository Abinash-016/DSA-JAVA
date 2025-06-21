import java.util.Scanner;
public class Find_The_Elemnt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many Numbers you want to add to the array");
        int a = sc.nextInt();

        int arr[]=new int[a];

        for(int i =0; i<arr.length; i++){
            System.out.println("Enter the next Integer:");
            arr[i]=sc.nextInt();
        }

        System.out.println("THe number you want to see the index of:");
        int data=sc.nextInt();
        int idx=-1;

        for (int i=0; i< arr.length; i++){
            if (arr[i]==data){
                idx=i;
                break;
            }
        }
        System.out.println("The Index of the data you put is : "+idx);
    }
}
