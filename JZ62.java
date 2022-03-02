public class Solution {
    public int LastRemaining_Solution(int n, int m) {
//         int[] circle = new int[n];
//         int k = 0, j = -1, count = n;
//         while(count > 0){
//             j++;
//             if(j==n)j = 0;
//             if(circle[j] != -1){
//                 k++;
//             }
//             if(k==m){
//                 circle[j] = -1;
//                 count--;
//                 k = 0;
//             }
//         }
//         return j;
        int[] circle = new int[n];
        int k = 0, j = 0, count = n;
        while(count > 1){
            if(circle[j] != -1){
                k++;
                if(k==m){
                    circle[j] = -1;
                    count--;
                    k = 0;
                }
            }
            j++;
            if(j==n)j = 0;
        }
        for(int i=0;i<n;i++){
            if(circle[i] != -1)return i;
        }
        return 0;
    }
}