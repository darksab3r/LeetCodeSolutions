class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(new ArrayList<Integer>());
        pascalTriangle.get(0).add(1);

        for(int n=2;n<=numRows;n++){
            int size=pascalTriangle.get(n-2).size(); //sice the pascal triangle is 1 based index while arrays have 0 based thus n-2 not n-1 for previous row siza
            ArrayList<Integer> currentRow = new ArrayList<>();
            pascalTriangle.add(currentRow);

            currentRow.add(1);

            for(int i=0;i<size-1;i++){
                currentRow.add(pascalTriangle.get(n-2).get(i)+pascalTriangle.get(n-2).get(i+1));
            }
            
            currentRow.add(1);
        }

        return pascalTriangle;
    }
}