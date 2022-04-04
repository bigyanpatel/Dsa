import java.util.*;
public class Subsequence {
    public static void printF(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);

        printF(roq, ans + ch);
        printF(roq, ans + "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3};
        StringBuilder strB = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            strB.append(arr[i]);
        }
        String str = strB.toString();
        printF(str, "");

    }
}
