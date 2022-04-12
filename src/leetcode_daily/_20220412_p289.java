package leetcode_daily;
class Solution_20220412 {
    public void gameOfLife(int[][] board) {
        
        int[][] newBoard = new int[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                int val = sum(i,j,board);
                
                if(board[i][j] == 1) {
                    
                    if(val != 2 && val != 3) {
                        newBoard[i][j] = 0;
                    } else {
                        newBoard[i][j] = board[i][j];
                    }
                    
                } else {
                    if(val == 3) {
                        newBoard[i][j] = 1;
                    } else {
                        newBoard[i][j] = board[i][j];
                    }
                    
                }
            }
        }
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }
    
    public int sum(int i, int j, int[][] board) {
        int val = 0;
        for(int r=i-1; r<=i+1; r++) {
            if(r < 0 || r >= board.length) {
                continue;
            }
            for(int c=j-1; c<=j+1; c++) {
                if(r == i && c == j) {
                    continue;
                }
                
                if(c < 0 || c >= board[r].length) {
                    continue;
                }
                
                if(board[r][c] == 1) {
                    val ++;
                }
            }
        }
        
        return val;
    }
}
public class _20220412_p289 {

}
