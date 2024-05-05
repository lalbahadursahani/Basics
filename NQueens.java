public class NQueens {


        public int[][] board;
        public int N;
    
        public NQueens(int N) {
            this.N= N;
            board = new int[N][N];
        }
    
        public void solveNQueens() {
            if (placeQueens(0)) {
                printBoard();
            } else {
                System.out.println("No solution exists.");
            }
        }
    
        public boolean placeQueens(int col) {
            if (col >= N) {
                return true; // All queens are placed
            }
    
            for (int row = 0; row < N; row++) {
                if (isSafe(row, col)) {
                    board[row][col] = 1; // Place the queen
    
                    if (placeQueens(col + 1)) {
                        return true;
                    }
    
                    board[row][col] = 0; // Backtrack
                }
            }
    
            return false; // No safe position found for this column
        }
    
        public boolean isSafe(int row, int col) {
            // Check row on left side
            for (int i = 0; i < col; i++) {
                if (board[row][i] == 1) {
                    return false;
                }
            }
    
            // Check upper diagonal on left side
            for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 1) {
                    return false;
                }
            }
    
            // Check lower diagonal on left side
            for (int i = row, j = col; i < N && j >= 0; i++, j--) {
                if (board[i][j] == 1) {
                    return false;
                }
            }
    
            return true; // If no conflicts, it's safe
        }
    
        public void printBoard() {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int N = 20; // Change N to desired board size
            NQueens nQueens = new NQueens(N);
            nQueens.solveNQueens();
        }
    }
    

