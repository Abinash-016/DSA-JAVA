import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the expression:");
        String exp = br.readLine();

        Stack<Integer> oprnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                oprnds.push(ch - '0'); // Convert char to int
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v1 = oprnds.pop();
                    int v2 = oprnds.pop();

                    int opv = operation(v2, v1, optor);
                    oprnds.push(opv);
                }
                optors.pop(); // Remove '(' from stack
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optors.size() > 0 && optors.peek() != '(' &&
                        precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop();
                    int v1 = oprnds.pop();
                    int v2 = oprnds.pop();

                    int opv = operation(v2, v1, optor);
                    oprnds.push(opv);
                }
                optors.push(ch);
            }
        }

        // Apply remaining operators to remaining operands
        while (optors.size() > 0) {
            char optor = optors.pop();
            int v1 = oprnds.pop();
            int v2 = oprnds.pop();

            int opv = operation(v2, v1, optor); // Correct order
            oprnds.push(opv);
        }

        // Final result
        System.out.println("Result: " + oprnds.pop());
    }

    public static int precedence(char optor) {
        if (optor == '+' || optor == '-') {
            return 1;
        } else if (optor == '*' || optor == '/') {
            return 2;
        }
        return 0;
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else if (optor == '/') {
            return v1 / v2;
        }
        return 0;
    }
}
