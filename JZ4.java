public class Solution {
    
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        if(row == 0)return false;
        int col = array[0].length;
        if(col == 0)return false;
        int i = 0, j = col - 1;
        while(i < row && j >= 0) {
            if(array[i][j] == target)return true;
            else if(target < array[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
   
}