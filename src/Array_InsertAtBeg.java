public class Array_InsertAtBeg {
    public static void main(String[] args) {
        int [] arr={1,5,6,7};
        int newElement= 0;

        int[] newArr= new int[arr.length +1];

        newArr[0]=newElement;

        for(int i=0; i< arr.length; i++){
            newArr[i+1]= arr[i];
        }

        System.out.println("After inserting at first elements are:");
        for(int num:newArr) {
            System.out.println(num);
        }
    }
}
