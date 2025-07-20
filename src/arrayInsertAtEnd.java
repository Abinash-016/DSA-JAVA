public class arrayInsertAtEnd {
    public static void main(String[] args) {
        int [] arr={11,12,13,14};
        int newElement=19;
        int [] updated=new int[arr.length+1];

        for (int i =0;i<arr.length;i++){
            updated[i]=arr[i];

        }
        updated[arr.length]=newElement;

        for (int num:updated) {
            System.out.println(num);
        }
    }
}
