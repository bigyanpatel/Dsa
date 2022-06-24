public class test {
    public static void main(String[] args) {
        int x = 9992423;
        int temp1 = x;
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

        for(int j = 24; j >= 0; j--){
            int ans = (int)Math.pow(2, j);
            if(ans <= x){
                x -= ans;
                num2++;
            }   
        }
        if(temp1 == 0 || x == 0)
            System.out.println(Math.min(num1, num2));
    }
}
