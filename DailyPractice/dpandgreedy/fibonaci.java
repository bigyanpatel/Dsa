import java.util.*;
public class fibonaci {

    private static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int n1 = fib(n-1);
        int n2 = fib(n -2);

        int res = n1 + n2;
        return res;
    }

    private static int fibMemorized(int n, int[] qb){
        if(n == 0 || n == 1){
            return n;
        }

        if(qb[n] != 0){
            return qb[n];
        }

        int n1 = fibMemorized(n - 1, qb);
        int n2 = fibMemorized(n - 2, qb);
        int res = n1 + n2;

        qb[n] = res;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibN = fibMemorized(n, new int[n + 1]);

        System.out.println(fibN);
    }
}
