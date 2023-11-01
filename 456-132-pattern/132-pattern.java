class Solution {
    public boolean find132pattern(int[] nums) {

        //maintain the second element with help of a stack
        //maintain the third element with a variable third
        //check if the current element is smaller than the third, if so we found our element 
        
        int n=nums.length;
        if(n<3)return false;

        int third = Integer.MIN_VALUE;
        Stack <Integer> stack = new Stack<>();

        for(int i= n-1;i>=0;i--){ //starting from right because we need the i to be smallest of all
            if (nums[i]<third){
                return true;
            }

            while(!stack.isEmpty() && nums[i]>stack.peek()){
                third = stack.pop();
            }

            stack.push(nums[i]);
        }
        return false;
    }
} 