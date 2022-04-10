import java.util.ArrayList;

public class Patterns {
    public static void printS(int ind, ArrayList<Integer> list, int s, int sum , int[] arr){
        if(ind == arr.length){
            if(s == sum){
                for(int i = 0; i < list.size(); i++){
                    System.out.print(list.get(i));
                }
                System.out.println();
            }
            return;
        }
        list.add(arr[ind]);
        s += arr[ind];

        printS(ind + 1, list, s, sum, arr);

        s -= arr[ind];
        list.remove(list.size() - 1);

        printS(ind + 1, list, s, sum, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 3};
        int sum = 4;
        ArrayList<Integer> list = new ArrayList<>();
        printS(0, list, 0, sum , arr);
    }
}