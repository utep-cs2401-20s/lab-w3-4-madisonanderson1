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
        previous = new int[size][size];
        board = new int[size][size];

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array.length; j++){
                previous[i][j] = array[i][j];
            }
        }
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

    public void oneStep(){
        for (int i = 0; i < board.length;i++){
            for (int j = 0; j < board.length; j++){
                previous[i][j] = board[i][j];
            }
        }
        for (int i = 0; i< board.length; i++){
            for (int j = 0; j<board.length;j++){
                if(board[i][j] == 1){
                    if(neighbors(i, j) < 2 || neighbors(i, j) > 3){
                        board[i][j] = 0;
                    }
                    if(neighbors(i, j) == 3 || neighbors(i, j) == 2){
                        board[i][j] = 1;
                    }
                }
                if(board[i][j] == 0){
                    if(neighbors(i, j) == 3){
                        board[i][j] = 1;
                    } else{
                        board[i][j] = 0;
                    }
                }
            }
        }
    }

    public void evolution(int n){
        for(int i = 1; i <= n; i++){
            oneStep();
        }
    }
    
}
