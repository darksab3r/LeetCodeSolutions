public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int bit=31;bit>=0;bit--){
            ans|= (n&1)<<(bit);
            n>>=1;
        }
        return ans;
    }
}