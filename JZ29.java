import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix.length == 0)return res;
        int lx = 0, hx = matrix.length - 1, ly = 0, hy = matrix[0].length - 1;
        while(lx <= hx && ly <= hy) 
            print(lx++, hx--, ly++, hy--, matrix, res);
        return res;
    }
    
    public void print(int lx, int hx, int ly, int hy, int[][] matrix, ArrayList<Integer> list) {
        //上
        for(int i=ly; i<=hy; i++)list.add(matrix[lx][i]);
        //右
        for(int i=lx+1; i<=hx; i++)list.add(matrix[i][hy]);
        //下
        int k = hx - lx + 1;
        if(k > 1)
            for(int i=hy-1; i>=ly; i--)list.add(matrix[hx][i]);
        //左
        int g = hy - ly + 1;
        if(g > 1)
            for(int i=hx-1; i>=lx+1; i--)list.add(matrix[i][ly]);
    } 
}