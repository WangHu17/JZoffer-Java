public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int[] count = new int[58];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i) - 'A']++;
        }
        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i) - 'A'] == 1)return i;
        }
        return -1;
    }
}