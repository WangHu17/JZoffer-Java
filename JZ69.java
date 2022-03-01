public class Solution {
    public int jumpFloor(int target) {
        if(target <= 3)return target;
        int[] a = new int[target + 1];
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        for(int i=4;i<=target;i++)a[i] = a[i-1] + a[i-2];
        return a[target];
    }
}