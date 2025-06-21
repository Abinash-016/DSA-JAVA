import java.util.*;
public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println("Enter R:");
        int r = sc.nextInt();

        // Calculate n!
        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }

        // Calculate (n-r)!
        int nmrfact = 1;
        for (int i = 1; i <= n - r; i++) {
            nmrfact *= i;
        }

        // Calculate nPr = n! / (n-r)!
        int npr = nfact / nmrfact;
        System.out.println(n + "P" + r + " = " + npr);
    }
}
