import java.util.*;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a =sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();


        int oa=a;
        int ob=b;

        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }

        int gcd= b;
        int lcm=(oa*ob)/ gcd;
        System.out.println("GCD of these numbers is "+gcd);
        System.out.println("LCM of these numbers is "+lcm);
    }
}
