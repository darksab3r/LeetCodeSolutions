class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        count_=0
        countL=0
        countR=0
        for ele in moves:
            if ele=='_':
                count_+=1
            elif ele=='L':
                countL+=1
            else:
                countR+=1
        return count_ + abs(countR-countL)