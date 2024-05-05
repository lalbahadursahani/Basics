/*public class SudokuSolver{ 
        public boolean isSafe(char[][]board,int row,int col,int number){
          
          // column
            for (int i=0; i<board.length;i++) {
                if (board[i][col]==(char)(number+'0')) {
                    return false;
               
                 //row   

                }for(int j=1; j<board.length;j++){
                if (board[row][i]==(char)(number+'0')) {
                    return false;
                    
                }
            }

        
            
            //grid
            int sr=(row/3)*3;
            int sc=(col/3)*3;
          
            
            for(int i=sr; i<sr+3; i++) {
                for(int j=sc; j<sc+3; j++){
                    if (board[i][j]==(char)(number+'0')){
                        return false;
                        
                    }
                }
                
            }

            return true;

        }
    }
        
        public boolean helper(char[][]board, int row, int col){
            if (row ==board.length) {
                return true;
                
            }

            int nrow=0;
            int ncol=0;
            if (col==board.length-1){
                nrow=row+1;
                ncol=0;

            }  
             else{
                nrow=row;
                ncol=col+1;

             }
            if (board[row][col] !='.') {
                if (helper(board, nrow, ncol)) {
                    return true;
                    
                }else{
                    for(int i=1; i<=9;i++){
                    if(isSafe(board,row,col,i)) {
                        board[row][col]=(char)(i+'0');
                        if (helper(board, nrow, ncol)) 
                            return true;
                            
                        else
                            board[row][col]='.';
                        
                    }
                    
                
                }

            }
                
        }    
            return false;
        }
            
        
    
        public void solveSudoku(char[][] board){
            helper(board, 0, 0);

        }
    
    
}*/
    

public class SudokuSolver {

    public  static final int SIZE = 9;
    public int[][] board;

    public SudokuSolver(int[][] board) {
        this.board = board;
    }

    public void solveSudoku() {
        if (solve()) {
            printBoard();
        } else {
            System.out.println("No solution exists.");
        }
    }

    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValidMove(row, col, num)) {
                            board[row][col] = num;
                            if (solve()) {
                                return true;
                            }
                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // No valid number for this cell
                }
            }
        }
        return true; // All cells filled
    }

    public boolean isValidMove(int row, int col, int num) {
        return !usedInRow(row, num) && !usedInCol(col, num) && !usedInBox(row - row % 3, col - col % 3, num);
    }

    public boolean usedInRow(int row, int num) {
        for (int col = 0; col < SIZE; col++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    public boolean usedInCol(int col, int num) {
        for (int row = 0; row < SIZE; row++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    public boolean usedInBox(int startRow, int startCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row + startRow][col + startCol] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        SudokuSolver solver = new SudokuSolver(board);
        solver.solveSudoku();
    }
} 
