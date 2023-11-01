class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int prevSpace = -1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                StringBuilder curr = new StringBuilder();
                curr.append(s.substring(prevSpace+1,i));
                curr.reverse();
                sb.append(curr.toString());
                sb.append(' ');
                prevSpace = i;
            }
        }

        StringBuilder curr = new StringBuilder();
        curr.append(s.substring(prevSpace+1,n));
        curr.reverse();
        sb.append(curr.toString());

        return sb.toString();
        
    }
}