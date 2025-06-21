import java.util.*;

public class fibnacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many series you want to see");
        int a = sc.nextInt();

        int x =0;
        int y =1;
        for (int i=0;i<a;i++){
            System.out.println(x);
            int z=x+y;
            x=y;
            y=z;
        }
    }
}
