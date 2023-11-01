
class Solution {
    int answer=0;
    int start_i;
    int start_j;
    int countOf0=0;

    boolean isFirstIter=true;
    public void helper(int i, int j, int current0, int [][] A){
        //base cases:

        if(i<0 || j< 0 || i>=A.length || j>=A[0].length) return;

        if(! isFirstIter){
            if(i==start_i && j==start_j) return;  //when cell is 1
        }

        isFirstIter=false;

        if(A[i][j]==2){ //when cell is 2
            if(current0-1==countOf0){  // we are adding 1 at every step step, we even add 1 when going 0 to 2 so decreasing by 1
                answer++;
            }
            return;
        }

        if(A[i][j]==3 || A[i][j]==-1) return; //when cell is 3 or -1

        //case left when A[i][j] is 0

        A[i][j]=3; //do step

        helper(i,j+1,current0+1,A);
        helper(i+1,j,current0+1,A);
        helper(i,j-1,current0+1,A);
        helper(i-1,j,current0+1,A);

        A[i][j]=0; //undo

    }

    public int uniquePathsIII(int[][] A) {
        //count number of zeroes in A
        start_i=0;
        start_j=0;

        int n=A.length;
        int m=A[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==1){
                    start_i=i;
                    start_j=j;
                }
                
                if(A[i][j]==0) countOf0++;
            
            }
        }

        helper(start_i,start_j,0,A);

        return answer;
    }
}