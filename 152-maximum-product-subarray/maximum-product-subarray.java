class Solution {
    public int maxProduct(int[] A) {
        int n=A.length;
		int minSoFar=A[0]; // minProduct of the subarray ending at index 0
		int maxSoFar=A[0]; //maxProduct of the subarray ending at index 0
		int answer= A[0];

		for(int i=1; i <n;i++){
			// keeping the track of the negative product  => max absolute value 
            // hence min of the negative
            int current_Min = Math.min(A[i],Math.min(A[i]*minSoFar,A[i]*maxSoFar)); 

            // keeping the track of the positive product
			int current_Max = Math.max(A[i],Math.max(A[i]*minSoFar,A[i]*maxSoFar)); 

			minSoFar = current_Min;
			maxSoFar = current_Max;
			answer=Math.max(answer,current_Max);
		}

		return answer;
    }
}