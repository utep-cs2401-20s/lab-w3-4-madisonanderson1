public class TorusGameOfLife extends GameOfLife {

    int size;
    int[][] previous;
    int[][] board;

    public TorusGameOfLife(){}

    public TorusGameOfLife(int size){
        super(size);
    }

    public TorusGameOfLife(int[][] array){
        super(array);
    }

    @Override
    public int neighbors(int row, int col) {
        int neighbors = 0;
        if(board[(row-1) % size][col % size] == 1){
            neighbors++;
        }
        if(board[(row-1) % size][(col-1) % size] == 1){
            neighbors++;
        }
        if(board[(row-1) % size][(col+1) % size] == 1){
            neighbors++;
        }
        if(board[row % size][(col-1) % size] == 1){
            neighbors++;
        }
        if(board[row % size][(col+1) % size] == 1){
            neighbors++;
        }
        if(board[(row+1) % size][col % size] == 1){
            neighbors++;
        }
        if(board[(row+1) % size][(col-1) % size] == 1){
            neighbors++;
        }
        if(board[(row+1) % size][(col+1) % size] == 1){
            neighbors++;
        }
       return neighbors;
    }
}
