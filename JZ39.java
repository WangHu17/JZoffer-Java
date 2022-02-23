public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        if(len==1)return array[0];
        int l=0,r=1;
        while(r < len){
            if(array[l] == -1 || array[r] == -1){
                l++;
                r++;
            }else if(array[l] != array[r]){
                array[l++]=-1;
                array[r++]=-1;
            }else{
                r++;
            }
        }
        for(int i=0;i<len;i++){
            if(array[i]!=-1)return array[i];
        }
        return 0;
    }
}