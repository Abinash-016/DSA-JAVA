//public class Stack {
//    public static void main(String[] args) {
//
//        java.util.Stack<Integer> st = new java.util.Stack<>();
//        st.push(10);  // Example usage
//        System.out.println("Top element: " + st+ " And the size of the stack is "+ st.size());
//    }
//}
//


// Duplicate Brackets

import java.util.*;

public  class Stack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter input");
        String a=sc.nextLine();

        java.util.Stack<Character> st=new java.util.Stack<>();
        for (int i =0;i<a.length();i++){
            char ch=a.charAt(i);
            if (ch==')'){
                if (st.peek()=='('){
                    System.out.println("There is a duplicate bracket plz check");
                    return;
                }else {
                    while(st.peek()!='('){
                        st.pop();
                    }st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println("There is no Duplicate Brackets");
    }
}