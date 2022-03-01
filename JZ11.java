import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        
        int left = 0, right = array.length - 1;
        while(left < right) {
            if(array[left] < array[right])break;
            int mid = left + (right - left)/2;
            if(array[right] > array[mid]){
                right = mid;
            }else if(array[right] < array[mid]){
                left = mid + 1;
            }else
                right--;
        }
        return array[left];
    }
}