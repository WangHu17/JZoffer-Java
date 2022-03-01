public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = array[0], max = array[0], flag = 0;
        for(int num:array){
            if(flag==0){
                flag++;
                continue;
            }
            sum += num;
            if(sum < num) {
                sum = num;
                if(max < num)max = num;
            }else{
                if(max < sum)max = sum;
            }
        }
        return max;
    }
}