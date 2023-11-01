class Solution {
    public int trap(int[] height) {
        
        //creating a prefix and postfix sum array
        int n = height.length;
        int lMax []=new int [n];
        int rMax [] = new int [n];
        lMax[0]=height[0];
        rMax[n-1]=height[n-1];
        int answer = 0;        
        //getting max height of any column uptill ith column
        for(int i=1;i<n;i++){
            lMax[i] = Math.max(lMax[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            rMax[i]=Math.max(rMax[i+1],height[i]);
        }

        for(int i = 1;i<n-1;i++){
            int delta = Math.min(lMax[i],rMax[i]) - height[i];
            if(delta > 0){
                answer += delta;
            }
        }

        return answer;
    }
}