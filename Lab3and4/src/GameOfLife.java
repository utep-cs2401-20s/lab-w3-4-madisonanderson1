import java.util.Arrays;

public class GameOfLife {

    public static void main(String[] args) {
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.evolution(2);
        System.out.println();
        test.printBoard();
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
                if (previous[row - 1][col - 1] == 1) {
                    neighbors+=1;
                }
            }
            if (col + 1 >= 0 && col +1 < board.length) {
                if (previous[row - 1][col + 1] == 1) {
                    neighbors+=1;
                }
            }
            if (previous[row - 1][col] == 1) {
                neighbors+=1;
            }
        }

        if (col - 1 >= 0 && col-1 < board.length) {
            if (previous[row][col - 1] == 1) {
                neighbors+=1;
            }
        }
        if (col+1 >= 0 && col+1 < board.length) {
            if (previous[row][col + 1] == 1) {
                neighbors+=1;
            }
        }
        if (row + 1 >= 0 && row+1 < board.length) {
            if (col - 1 >= 0 && col-1 < board.length) {
                if (previous[row + 1][col - 1] == 1) {
                    neighbors+=1;
                }
            }
            if (col+1 >= 0 && col+1 < board.length) {
                if (previous[row + 1][col + 1] == 1) {
                    neighbors+=1;
                }
            }
            if (previous[row + 1][col] == 1) {
                neighbors+=1;
            }
        }
        return neighbors;
    }

    public void oneStep(){
        for (int i = 0; i< board.length; i++){
            for (int j = 0; j<board.length;j++){
                if(previous[i][j] == 1){
                    if(neighbors(i, j) < 2 || neighbors(i, j) > 3){
                        board[i][j] = 0;
                    }
                    if(neighbors(i, j) == 3 || neighbors(i, j) == 2){
                        board[i][j] = 1;
                    }
                }
                if(previous[i][j] == 0){
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
            for (int r = 0; r< board.length; r++) {
                for (int c = 0; c < board.length; c++) {
                    previous[r][c]=board[r][c];
                }
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (int i = 0; i < board.length;i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void printPrevious() {
        for (int i = 0; i < board.length;i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(previous[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GameOfLife{" +
                "size=" + size +
                ", previous=" + Arrays.toString(previous) +
                ", board=" + Arrays.toString(board) +
                '}';
    }
}
