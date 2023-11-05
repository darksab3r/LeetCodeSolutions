class Solution {
    int [] nums;
    public void sortColors(int[] nums) {
        this.nums=nums;
        int n=nums.length;
        int ind0=0;
        int ind2=n-1;
        int k=0;
        while(k<=ind2){
            if(nums[k]==0 &&k>ind0){
                swap(k,ind0);
                ind0++;
                // k++; //to make sure that k isnt going to swap any elemets from 0 to ind0
            }
            else if(nums[k]==2){
                swap(k,ind2);
                ind2--;
            }
            else{
                k++;
            }
        }
    }
    public void swap(int ind1,int ind2){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}