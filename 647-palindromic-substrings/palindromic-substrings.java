class Solution {
    //brute force approach would be to generate all substrings => contigous tc O(n^3)

    //optimization : use tabulation for a substring s(i,j)

    public int countSubstrings(String s) {

        int n = s.length();
        boolean [][] dp = new boolean [n][n];
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(s.charAt(i)==s.charAt(j) && (i-j<=1 || dp[j+1][i-1])){
                    dp[j][i]=true;
                    count++;
                }
            }
        }
        
        return count;
    }
}