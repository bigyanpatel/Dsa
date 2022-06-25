public class test {
    public static void main(String[] args) {
        int N = 15;

        int temp1 = N;
        int temp2 = N;
        int num1 = 0; 
        int num2 = 0;

        for(int i = 15; i >= 1; i--){
            int ans = (int)Math.pow(3, i);
            if(ans <= temp1){
                temp1 -= ans;
                num1++;
            }   
        }
        for(int j = 24; j >= 0; j--){
            int ans = (int)Math.pow(2, j);
            if(ans <= temp1){
                temp1 -= ans;
                num1++;
            }   
        }

        for(int j = 24; j >= 1; j--){
            int ans = (int)Math.pow(2, j);
            if(ans <= temp2){
                temp2 -= ans;
                num2++;
            }   
        }
        
        for(int i = 15; i >= 0; i--){
            int ans = (int)Math.pow(3, i);
            if(ans <= temp2){
                temp2 -= ans;
                num2++;
            }   
        }        
            System.out.println(Math.min(num1, num2));
            // System.out.println(num1);
    }
}
