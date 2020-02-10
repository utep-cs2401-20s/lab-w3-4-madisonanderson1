public class GameOfLife {

    public GameOfLife(){}

    public GameOfLife(int size){
        int[][] previous = new int[size][size]
        int[][] board = new int[size][size];
    }

    public GameOfLife(int[][] array){
        int size = array.length;
        int[][] previous = new int[size][size]
        int[][] board = new int[size][size];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                previous[i][j] = array[i][j];
            }
        }
    }

}
