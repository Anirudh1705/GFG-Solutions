
class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> solutions = new ArrayList<>();
        backtrack(n, 0, new ArrayList<>(), solutions);
        return solutions;
    }
    private void backtrack(int n, int col, ArrayList<Integer> queenPositions, ArrayList<ArrayList<Integer>> solutions) {
        if (col == n) {
            solutions.add(new ArrayList<>(queenPositions));
            return;
        }
    
        for (int row = 1; row <= n; row++) {
            if (isSafe(queenPositions, row, col)) {
                queenPositions.add(row);
                backtrack(n, col + 1, queenPositions, solutions);
                queenPositions.remove(queenPositions.size() - 1);
            }
        }
    }
    private boolean isSafe(ArrayList<Integer> queenPositions, int newRow, int newCol) {
        for (int col = 0; col < queenPositions.size(); col++) {
            int row = queenPositions.get(col);
            if (row == newRow || Math.abs(row - newRow) == Math.abs(col - newCol)) {
                return false;
            }
        }
        return true;
    }
}
