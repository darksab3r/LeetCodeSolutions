class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minTime = 0;
        Deque<Integer>stack = new ArrayDeque<>();
        stack.push(0);
        for(int i=1;i<colors.length();i++){
            if(!stack.isEmpty() && colors.charAt(stack.peek())==colors.charAt(i)){
                if(neededTime[stack.peek()]<=neededTime[i]){
                    System.out.print(stack.peek()+" "+i+" | ");
                    minTime+=neededTime[stack.pop()];
                    stack.push(i);
                }
                else{
                    minTime+=neededTime[i];
                }
            }
            else{
                stack.push(i);
            }
        }
        return minTime;
    }
}