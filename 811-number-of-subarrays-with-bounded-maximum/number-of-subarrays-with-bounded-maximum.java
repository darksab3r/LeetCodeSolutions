class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int i = 0;
        int j = 0;
        int count = 0;
        int lastValidLength = 0;

        while(j<nums.length){
            if(nums[j]>=left && nums[j]<=right){
                lastValidLength = j-i+1;
                count += lastValidLength;
            }
            else if(nums[j]<left){
                count+= lastValidLength;
            }
            else{
                i=j+1;
                lastValidLength = 0;
            }
            j++;
        }
        return count;
    }
}