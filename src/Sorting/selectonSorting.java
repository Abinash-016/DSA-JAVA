package Sorting;

public class selectonSorting {
    public static void printArray(int arr[]) {
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 2, 3, 4};

        //selsction sort

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]< arr[smallest] ) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
