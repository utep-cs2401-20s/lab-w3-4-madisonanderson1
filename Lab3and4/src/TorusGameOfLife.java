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

    

}
