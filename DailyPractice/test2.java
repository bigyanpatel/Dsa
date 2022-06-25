import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        int N = 20;
        Stack<Integer> pow1 = new Stack<>();
        Stack<Integer> pow2 = new Stack<>();
        int ans = 0;
        for(int i = 0; i <= 24; i++){
            pow1.push((int)Math.pow(2, i));
        }
        for(int i = 0; i <= 15; i++){
            pow2.push((int)Math.pow(3, i));
        }
        while(true){
            while(pow1.peek() > N || pow2.peek() > N){
                if(pow1.peek() > N){
                    pow1.pop();
                }
                if(pow2.peek() > N){
                    pow2.pop();
                }
            }
    
            N -= Math.max(pow1.peek(), pow2.peek());
            ans++;
            if(N == 0){
                break;
            }
        }

        System.out.println(ans);
    }
}
