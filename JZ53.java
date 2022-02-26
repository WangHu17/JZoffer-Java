public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       int left = 0, right = array.length-1, count = 0, p = -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(array[mid] == k){
                p = mid;
                break;
            }else if(array[mid] < k){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if(p == -1)return 0;
        int i = p, j = p+1;
        while(i >= 0){
            if(array[i--] == k)count++;
            else break;
        }
        while(j < array.length){
            if(array[j++] == k)count++;
            else break;
        }
        return count;
    }
}