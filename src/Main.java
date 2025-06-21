import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number up to where you want to show :");
        int a = sc.nextInt();

        // Loop through numbers from 2 to `a`
        for (int num = 2; num <= a; num++) {
            int count = 0;

            // Check divisors for the current number `num`
            for (int div = 1; div <= num; div++) {
                if (num % div == 0) {
                    count++;
                }
            }

            // Check if the number is prime
            if (count == 2) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
