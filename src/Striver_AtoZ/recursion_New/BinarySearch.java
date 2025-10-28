package Striver_AtoZ.recursion_New;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        int target=3;
        System.out.println(binary(arr,target,0, arr.length-1));
    }
    static int binary(int[] arr,int target ,int start, int end){
        if(start > end){
            return -1;
        }
        int m= start+ (end-start) /2;
        if(arr[m] == target){
            return m;
        }
        if (target < arr[m]){
            return binary(arr, target, start, m-1);
        }
        return binary(arr, target, m+1, end);
    }
}
