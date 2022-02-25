import java.util.Arrays;

public class Solution {
    public boolean IsContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int zero = 0, cha = 0;
        for(int i=0; i<numbers.length - 1; i++){
            if(numbers[i]==0)zero++;
            else if(numbers[i] == numbers[i+1])return false;
            else{
                int t = numbers[i + 1] - numbers[i];
                if(t > 1)cha += t - 1;
            }
        }
        return cha <= zero;
    }
}