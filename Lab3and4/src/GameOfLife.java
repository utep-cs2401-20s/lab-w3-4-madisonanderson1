public class GameOfLife {

    public static void main(String[] args) {

    }

     int size;
     int[][] previous;
     int[][] board;

    public GameOfLife(){}

    public GameOfLife(int size){
        this.size = size;
        this.previous = new int[size][size];
        this.board = new int[size][size];
    }

    public GameOfLife(int[][] array){
        int size = array.length;
        int[][] previous = new int[size][size];
        int[][] board = new int[size][size];

        previous = array;
    }

    public int neighbors (int row, int col){
        int neighbors = 0;
        if (row-1 >= 0 && row-1 < board.length) {
            if (col - 1 >= 0 && col -1 < board.length) {
                if (board[row - 1][col - 1] == 1) {
                    neighbors++;
                }
            }
            if (col + 1 >= 0 && col +1 < board.length) {
                if (board[row - 1][col + 1] == 1) {
                    neighbors++;
                }
            }
            if (board[row - 1][col] == 1) {
                neighbors++;
            }
        }

        if (col - 1 >= 0 && col-1 < board.length) {
            if (board[row][col - 1] == 1) {
                neighbors++;
            }
        }
        if (col+1 >= 0 && col+1 < board.length) {
            if (board[row][col + 1] == 1) {
                neighbors++;
            }
        }
        if (row + 1 >= 0 && row+1 < board.length) {
            if (col - 1 >= 0 && col-1 < board.length) {
                if (board[row + 1][col - 1] == 1) {
                    neighbors++;
                }
            }
            if (col+1 >= 0 && col+1 < board.length) {
                if (board[row + 1][col + 1] == 1) {
                    neighbors++;
                }
            }
            if (board[row + 1][col] == 1) {
                neighbors++;
            }
        }
        return neighbors;
    }
    
}
