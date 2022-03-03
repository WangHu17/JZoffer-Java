public class Solution {
    public int jumpFloorII(int target) {
        if(target == 0 || target == 1)return target;
        int a = 1, b = 0;
        for(int i=2;i<=target;i++){
            b = a << 1;
            a = b;
        }
        return b;
    }
}