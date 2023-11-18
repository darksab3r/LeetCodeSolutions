class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int ans[][] = new int[r][c];
        int ii=0;
        int jj=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(jj==n){
                    ii++;
                    jj=0;
                }
                ans[i][j]=mat[ii][jj];
                jj++;
            }
        }

        return ans;
    }
}