class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLength=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum = 0;

        while(j<nums.length){
            if(sum<target){
                sum+=nums[j];
                j++;
            }
            else{
                sum-=nums[i];
                i++;
            }
            if(sum>=target){
                minLength = Math.min(minLength,(j-i));
            }
        }

        while(i<nums.length && sum>target){
            sum-=nums[i];
            i++;
            if(sum>=target){
                minLength = Math.min(minLength,(j-i));
            }
        }

        if(minLength==Integer.MAX_VALUE) return 0;
        return minLength;

    }
}