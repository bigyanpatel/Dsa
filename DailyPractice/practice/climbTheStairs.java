import java.util.*;
class climbTheStairs {
    public static boolean flag = false;
    public static boolean isPossible(int[] arr, int idx){
        if(idx == arr.length - 1){
            flag = true;
            return true;
        } else if(idx < 0 || idx >= arr.length){
            return false;
        }

        if(arr[idx] == 1){
            return false;
        }

        if(flag != true){
            isPossible(arr, idx + idx + 1);
            isPossible(arr, idx + idx - 1);
        }
        return flag;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {0, 0, 0, 1, 0};
            
        System.out.println(isPossible(arr, 0));
    }
}