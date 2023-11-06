class Solution {
    public void rotate(int[][] matrix) {

        int size=matrix.length;
        //transpose
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                swap(matrix,i,j);
            }
        }
        //reverse each row
        for(int i=0;i<size;i++){
            reverse(matrix[i]);
        }

    }
    public void reverse(int arr[]){
        int size=arr.length;
        int i=0;
        int j=size-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void swap(int [][]matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }

}