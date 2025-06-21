import java.io.*;
import java.util.Stack;

public class AreaHistogram {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Inputs you want to enter:");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Now Enter -");
            a[i]=Integer.parseInt(br.readLine());
        }


        int[] rb=new int[a.length];
            Stack<Integer> st=new Stack<>();
            st.push(a.length-1);
            rb[a.length-1]=a.length;


            for (int i=a.length-2;i>=0;i--){
                while (!st.isEmpty() &&  a[i]  <  a[st.peek()]){
                    st.pop();
                }
                if (st.isEmpty()){
                    rb[i]=a.length;
                }else {
                    rb[i]=st.peek();
                }
                st.push(i);
            }




        int[] lb=new int[a.length];
            st=new Stack<>();
        st.push(0);
        lb[0]=-1;


        for (int i=0 ;i<a.length ;i++){
            while (!st.isEmpty() &&  a[i]  <  a[st.peek()]){
                st.pop();
            }
            if (st.isEmpty()){
                lb[i]=-1;
            }else {
                lb[i]=st.peek();
            }
            st.push(i);
        }



        int maxArea=0;
        for (int i =0;i<a.length;i++){
            int width=rb[i]-lb[i]-1;
            int area=a[i]*width;
            if (area>maxArea){
                maxArea=area;
            }

        }
        System.out.println("The maximum area in the histogram is: "+maxArea);
    }

}
