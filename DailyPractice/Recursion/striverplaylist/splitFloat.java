import java.util.*;
public class splitFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        String ans = String.valueOf(n);
        String integer = ans.substring(0, ans.indexOf("."));
        String decPart = ans.substring(ans.indexOf(".") + 1);
        System.out.println("Integer: " + integer + " Decimal: " + decPart);
    }
}
