class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int fullfilledChildren = 0;
        int n = g.length;
        int m = s.length;
        int i = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(i<n && j<m){
            if(g[i]<=s[j]){
                fullfilledChildren +=1;
                i+=1;
                j+=1;
            }
            else{
                j+=1;
            }
        }

        return fullfilledChildren;
    }
}