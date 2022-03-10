import java.util.*;

//在一个m\times nm×n的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
//你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
//给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
public class Solution {
    
    public int maxValue (int[][] grid) {
        int row = grid.length, col = grid[0].length;
        if(row == 0)return 0;
        int[][] count = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                count[i][j] = grid[i][j];
                if(i>0 && j>0)
                    count[i][j] += Math.max(count[i-1][j], count[i][j-1]);
                else if(i>0)
                    count[i][j] += count[i-1][j];
                else if(j>0)
                    count[i][j] += count[i][j-1];
            }
        }
        return count[row-1][col-1];
    }
    
}