class Solution {
    public int numberOfBeams(String[] bank) {
        
        int n = bank.length;
        int m = bank[0].length();
        int lasers = 0;

        int devicesPerRow[] = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                count += bank[i].charAt(j)=='1'?1:0;
            }
            devicesPerRow[i] = count;
        }

        for(int i=0;i<n-1;i++){
            int j = i+1;
            while(j<n && devicesPerRow[j]==0){
                j+=1;
            }
            if(j<n){
                lasers+= devicesPerRow[i]*devicesPerRow[j];
            }
        }

        return lasers;

    }
}