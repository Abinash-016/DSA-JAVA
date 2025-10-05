package recursion_New;

public class printNumbers {

    public static void main(String[] args) {
        num(1);
    }
    static void num(int n){
        if(n ==5){
            return;
        }
        System.out.println(n);
        num(n+1);

    }
}
