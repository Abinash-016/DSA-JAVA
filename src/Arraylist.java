import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<Integer>();

//        Add  a element in the arraylist
        list.add(0);
        list.add(5);
        list.add(3);
        list.add(4);
        System.out.println(list);


//        get a element
        int ele= list.get(2);
        System.out.println(ele);

//        add in between
        list.add(1,2);
        System.out.println(list);

//        set a element
        list.set(2,2);
        list.set(1,1);
        System.out.println(list);

//        delete a element
        list.remove(4);
        System.out.println(list);

//        sorting in arrray list
        Collections.sort(list);
        System.out.println(list);
    }
}
