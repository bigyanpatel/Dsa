import java.util.*;

public class findFib{
    public static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int findN;
        // int count = 0;
        for(int i = 0; ;i++){
            if(fib(i) == num){
                findN = i;
                break;
            }
            // count++;
        }
        findN += n;
        System.out.println(fib(findN));
    }
}
