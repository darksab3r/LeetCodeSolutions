class Solution {
    //this problem can be solved by moore's voting algo
    public List<Integer> majorityElement(int[] nums) {

        int num1=-1;
        int freq1=0;
        int num2=0;
        int freq2=0;

        int n=nums.length;

        for(int i=0;i<n;i++){

            if(nums[i]==num1){
                freq1+=1;
            }
            else if(nums[i]==num2){
                freq2+=1;
            }

            else if(freq1==0){
                num1=nums[i];
                freq1=1;
            }
            else if(freq2==0){
                num2=nums[i];
                freq2=1;
            }
            else{
                freq1-=1;
                freq2-=1;
            }
        }

        freq1=0;
        freq2=0;

        for(int i=0;i<n;i++){
            if(nums[i]==num1) freq1++;
            if(nums[i]==num2) freq2++;
        }

        ArrayList <Integer> answer = new ArrayList<>();
        if(freq1>n/3) answer.add(num1);
        if(freq2>n/3) answer.add(num2);

        return answer;

    }
}