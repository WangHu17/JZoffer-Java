import java.util.*;

//矩阵中的路径
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param matrix char字符型二维数组 
     * @param word string字符串 
     * @return bool布尔型
     */
    public boolean hasPath (char[][] matrix, String word) {
        char[] words = word.toCharArray();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(dfs(matrix, words, i ,j, 0))return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] matrix, char[] words, int i, int j, int cur){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] != words[cur])
            return false;
        if(cur == words.length - 1)return true;
        char temp = matrix[i][j];
        matrix[i][j] = '-';
        boolean res = dfs(matrix, words, i+1, j, cur+1) ||
                    dfs(matrix, words, i-1, j, cur+1) ||
                    dfs(matrix, words, i, j+1, cur+1) ||
                    dfs(matrix, words, i, j-1, cur+1);
        matrix[i][j] = temp;
        return res;
    }
}