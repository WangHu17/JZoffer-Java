//机器人的运动范围
public class Solution {
    
    private boolean[][] check;
    private int thres;
    private int r;
    private int c;
    
    public int movingCount(int threshold, int rows, int cols) {
        if(threshold < 0 || rows <= 0 || cols <= 0)return 0;
        check = new boolean[rows][cols];
        thres = threshold;
        r = rows;
        c = cols;
        return count(0, 0);
    }
    
    public int count(int row, int col){
        if(row < 0 || col < 0 || row >= r || col >= c || check[row][col] ||
           cal(row) + cal(col) > thres)
            return 0;
        check[row][col] = true;
        return 1 + count(row + 1, col) + count(row, col + 1) + count(row - 1, col)
            + count(row, col - 1);
    }
    
    public int cal(int n){
        int res = 0;
        while(n>0){
            res += n%10;
            n /= 10;
        }
        return res;
    }
}