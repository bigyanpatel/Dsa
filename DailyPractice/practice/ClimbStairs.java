import java.util.*;

public class ClimbStairs {
    public static boolean isPossible(int[] arr){
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                map.put(i + 1, new HashSet<>());
            }
        }
        
        map.get(1).add(2);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) continue; 
            int currStair = i + 1;
            HashSet<Integer> jumps = new HashSet<>(map.get(currStair));
            for(int jump : jumps){
                int pos = currStair + jump;
                if(pos == arr.length) return true;
                if(map.containsKey(pos) == true){
                    map.get(pos).add(currStair - 1);
                    map.get(pos).add(currStair + 1);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 0, 0};
        System.out.println(isPossible(arr));
    }
}
