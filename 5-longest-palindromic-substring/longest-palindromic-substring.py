class Solution:
    def longestPalindrome(self, s: str) -> str:
        ans=0
        st=0
        e=0
        curr=0
        for i in range(len(s)):
            #even
            j=i
            k=i+1
            while j>=0 and k<len(s) and (s[j]==s[k]):
                curr=k-j+1
                j-=1
                k+=1
            if curr>ans:
                ans=curr
                st=j+1
                e=k-1
            #odd
            curr=1
            j=i-1
            k=i+1
            while k<len(s) and j>=0 and (s[j]==s[k]):
                curr=k-j+1
                j-=1
                k+=1
            if curr>ans:
                ans=curr
                st=j+1
                e=k-1
        return s[st:e+1]