package leetcode_daily;

class Solution_20220414_p59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int val = 1;
        int direction = 1;
        int i = 0;
        int j = -1;
        int movCount = 0;
        int limitMove = n*n;
        while(movCount < limitMove) {
            if(direction == 1) {
                j++;
                for(; j<n; j++) {
                    if(matrix[i][j] != 0) {
                        break;
                    }
                    matrix[i][j] = val++;
                }
                j--;
            }else if(direction == 2) {
                i++;
                for(; i<n; i++) {
                    if(matrix[i][j] != 0) {
                        break;
                    }
                    matrix[i][j] = val++;
                }
                i--;
            }else if(direction == 3) {
                j--;
                for(; j>=0; j--) {
                    if(matrix[i][j] != 0) {
                        break;
                    }
                    matrix[i][j] = val++;
                }
                j++;
            }else if(direction == 4) {
                i--;
                for(; i>=0; i--) {
                    if(matrix[i][j] != 0) {
                        break;
                    }
                    matrix[i][j] = val++;
                }
                i++;
            }
            movCount++;
            direction = (direction)%4 + 1;
        }
        
        return matrix;
    }
}

public class _20220414_p59 {

}
