class Solution {
    //we can use prefix sum array here.
    //the problem would reduce to, for a given array count number of pairs/or elements with difference/ value = k such that prefix[j]-prefix[i] = k and i<j

    public int subarraySum(int[] nums, int k) {
        
        int n = nums.length;
        int [] prefixSum = new int [n];
        HashMap <Integer,Integer> map = new HashMap<>();
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }

        int count=0;
        for(int i=n-1;i>=0;i--){
            if(prefixSum[i]==k) count++;
            if(map.containsKey(prefixSum[i]+k)){
                count+=map.get(prefixSum[i]+k);
            }
            if(map.containsKey(prefixSum[i])){
                map.replace(prefixSum[i],map.get(prefixSum[i])+1);
            }
            else{
                map.put(prefixSum[i],1);
            }
        }

        return count;
    }
}