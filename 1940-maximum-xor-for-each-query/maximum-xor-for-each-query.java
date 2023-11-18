class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int n = nums.length;
        int answer[] = new int [n];
        int xorAll = 0;
        int msb = maximumBit-1;
        //get xor of all elements
        for(int num:nums){
            xorAll^=num;
        }
        for(int query=0;query<n;query++){
            int k=0;
            for(int bit=msb;bit>=0;bit--){
                if((xorAll&(1<<bit))==0){
                    k|=(1<<bit);
                }
            }
            answer[query] = k;
            xorAll^=nums[n-1-query];
        }

        return answer;
    }
}