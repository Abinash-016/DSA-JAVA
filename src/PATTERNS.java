//import java.util.*;
//public class PATTERNS {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("ENTER\t-");
//        int n  = sc.nextInt();
//
//        for (int i=1 ; i<=n ; i++){
//            for (int j=1; j<=i ;j++){
//            System.out.print("*\t");}
//            System.out.println();
//        }
//
//
//    }
//}

//             REVERSE

import java.util.*;
public class PATTERNS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER\t-");
        int n  = sc.nextInt();

        for (int i=n ; i>=1 ; i--){
            for (int j=1; j<=i ;j++){
                System.out.print("*\t");}
            System.out.println();
        }


    }
}

