import java.util.*;

public class test {

    private static int findMat(int x, int y){
        int[][] mat = new int[1000][1000];
        int rowNo = 0;
        int colNo = 0;

        int rowEnd = 999, colEnd = 999;

        int count = 1;
        
        while(rowNo <= rowEnd && colNo <= colEnd){
            if(rowNo % 2 == 0){
                for(int j = 0; j <= colNo; j++){
                    mat[rowNo][j] = count;
                    count++;
                }
                for(int i = rowNo - 1; i >= 0; i--){
                    mat[i][colNo] = count;
                    count++;
                }
                rowNo++;
                colNo++;
            } else {
                for(int i = 0; i <= rowNo; i++){
                    mat[i][colNo] = count;
                    count++;
                }
                for(int j = colNo - 1; j >= 0; j--){
                    mat[rowNo][j] = count;
                    count++;
                }
                rowNo++;
                colNo++;
            }
        }

        return mat[x][y];
        // for(int i = 0; i < rowEnd; i++){
        //     for(int j = 0; j < colEnd; j++){
        //         System.out.print(mat[i][j] + "  ");
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println(findMat(row - 1, col - 1));
    }
}

/*
if odd row
    col starts at 1 to col_end
    then
        row-- until row == 0
it even row
    row = 0; col = colNo to row = roNo
    then
        colNo-- until 0
*/
