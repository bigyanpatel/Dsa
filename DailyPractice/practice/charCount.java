import java.util.*;

public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] intFreq = new int[10];
        int[] charFreq = new int[26];

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                charFreq[str.charAt(i) - 'a']++;
            }
            
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                intFreq[str.charAt(i) - '0']++;
            }
        }
        
        // for(int i = 0; i < charFreq.length; i++){
        //     System.out.print(charFreq[i]);
        // }
        char ch;
        int count = 0;
        for(int i = 0; i < charFreq.length; i++){
            ch = (char)(i + 'a');
            if(charFreq[i] >= 2){
                System.out.print(ch + " : " + charFreq[i] + " ");
                count++;
            }
        }
        for(int i = 0; i < intFreq.length; i++){
            if(intFreq[i] >= 2){
                System.out.print(i + " : " + intFreq[i] + " ");
                count++;
            }
        }

        if(count == 0){
            System.out.println("Valid Input");
        }
    }
}
