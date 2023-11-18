class Solution {
    public int diagonalSum(int[][] mat) {
        int diagonalSum = 0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            diagonalSum+=mat[i][i];
        }

        for(int i=0;i<n;i++){
            if(i!=n-i-1){
                diagonalSum+=mat[i][n-1-i];
            }
        }

        return diagonalSum;
    }
}