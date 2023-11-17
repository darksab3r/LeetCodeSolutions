class Solution {
    public int maximumWealth(int[][] accounts) {

        int highestWealth = 0;
        int m=accounts.length;
        int n = accounts[0].length;
        for(int i=0;i<m;i++){
            int currentWealth = 0;
            for(int j=0;j<n;j++){
                currentWealth += accounts[i][j];
            }
            highestWealth = Math.max(currentWealth,highestWealth);
        }

        return highestWealth;
    }
}