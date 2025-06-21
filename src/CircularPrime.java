import javax.swing.JOptionPane;

public class CircularPrime {

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static int rotate(int num, int len) {
        int rem = num % 10;
        num = num / 10;
        return rem * (int)Math.pow(10, len - 1) + num;
    }

    static boolean isCircularPrime(int num) {
        int len = String.valueOf(num).length();
        int rotated = num;
        for (int i = 0; i < len; i++) {
            if (!isPrime(rotated)) return false;
            rotated = rotate(rotated, len);
        }
        return true;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);

        if (isCircularPrime(number)) {
            JOptionPane.showMessageDialog(null, number + " is a Circular Prime!");
        } else {
            JOptionPane.showMessageDialog(null, number + " is NOT a Circular Prime.");
        }
    }
}
