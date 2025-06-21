import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class infix_Conversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the expression:");
        String exp = br.readLine();

        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isLetterOrDigit(ch)) {
                // Push operands as strings into pre and post stacks
                pre.push(ch + "");
                post.push(ch + "");
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char op = optors.pop();

                    // Postfix processing
                    String postV2 = post.pop();
                    String postV1 = post.pop();
                    String postv = postV1 + postV2 + op;
                    post.push(postv);

                    // Prefix processing
                    String preV2 = pre.pop();
                    String preV1 = pre.pop();
                    String prev = op + preV1 + preV2;
                    pre.push(prev);
                }
                optors.pop(); // Remove '(' from stack
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optors.size() > 0 &&
                        optors.peek() != '(' &&
                        precedence(ch) <= precedence(optors.peek())) {
                    char op = optors.pop();

                    // Postfix processing
                    String postV2 = post.pop();
                    String postV1 = post.pop();
                    String postv = postV1 + postV2 + op;
                    post.push(postv);

                    // Prefix processing
                    String preV2 = pre.pop();
                    String preV1 = pre.pop();
                    String prev = op + preV1 + preV2;
                    pre.push(prev);
                }
                optors.push(ch);
            }
        }

        // Process remaining operators
        while (optors.size() > 0) {
            char op = optors.pop();

            // Postfix processing
            String postV2 = post.pop();
            String postV1 = post.pop();
            String postv = postV1 + postV2 + op;
            post.push(postv);

            // Prefix processing
            String preV2 = pre.pop();
            String preV1 = pre.pop();
            String prev = op + preV1 + preV2;
            pre.push(prev);
        }

        // Final results
        System.out.println("Prefix: " + pre.pop());
        System.out.println("Postfix: " + post.pop());
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }
}
