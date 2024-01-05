class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            maxWater=Math.max(maxWater,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i+=1;
            }
            else{
                j-=1;
            }
        }
        return maxWater;
    }
}