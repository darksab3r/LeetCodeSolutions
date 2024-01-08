class Solution {
    public int kthFactor(int n, int k) {
        int i=1;
        int count = 0;
        while(i<=n){
            if(n%i==0){
                count+=1;
            }
            if(k==count){
                return i;
            }
            i+=1;
        }
        return -1;
    }
}