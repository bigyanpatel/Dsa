import java.util.*;
class LonSub{
    public static void lonSub(int[] arr){
        int idx1 = 0;
        int idx2 = 1;

        ArrayList<Integer> arrl1 = new ArrayList<>();
        ArrayList<Integer> arrl2 = new ArrayList<>();
        
        arrl1.add(arr[idx1]);
        while(idx2 < arr.length){
            if(arr[idx2] - 1 == arr[idx2 - 1]){
                // res = Math.max(res, idx2 - idx1);
                arrl1.add(arr[idx2]);
                idx2++;
            } else{
                if(arrl1.size() > arrl2.size()){
                    arrl2 = new ArrayList<>(arrl1);
                }
                while(arrl1.size() > 0){
                    arrl1.remove(arrl1.size() - 1);
                }
                idx1 = idx2;
                idx2 = idx1 + 1;
                arrl1.add(arr[idx1]);
            }
        }
        if(arrl1.size() > arrl2.size()){
            arrl2 = new ArrayList<>(arrl1);
        }
        System.out.print(arrl2);
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 7, 8, 9, 10, 11, 5, 6, 7, 8};
        lonSub(arr);
    }
}