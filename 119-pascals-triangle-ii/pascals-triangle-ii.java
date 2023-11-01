class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(new ArrayList<>());
        pascalTriangle.add(new ArrayList<>());

        // Initialize the first row with a single element '1'
        pascalTriangle.get(0).add(1);

        // Generate the rest of the rows
        for (int currentRow = 1; currentRow <= rowIndex; currentRow++) {
            // The first element of each row is always '1'
            pascalTriangle.get(1).add(1);

            List<Integer> currentRowList = pascalTriangle.get(1);
            List<Integer> previousRowList = pascalTriangle.get(0);

            // Calculate and populate the middle elements of the row
            for (int j = 1; j < previousRowList.size(); j++) {
                int sum = previousRowList.get(j) + previousRowList.get(j - 1);
                currentRowList.add(sum);
            }

            // The last element of each row is also '1'
            currentRowList.add(1);

            // Switch rows
            pascalTriangle.set(0, new ArrayList<>(pascalTriangle.get(1)));
            pascalTriangle.get(1).clear();
        }

        return pascalTriangle.get(0);
    }
}