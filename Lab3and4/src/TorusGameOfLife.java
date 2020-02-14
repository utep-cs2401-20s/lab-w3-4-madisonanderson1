public class TorusGameOfLife extends GameOfLife {

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
        if(previous[Math.floorMod(row-1, size)][Math.floorMod(col,size)] == 1){
            neighbors++;
        }
        if(previous[Math.floorMod(row-1,size)][Math.floorMod(col-1,size)] == 1){
            neighbors++;
        }
        if(previous[Math.floorMod(row-1, size)][Math.floorMod(col+1,size)] == 1){
            neighbors++;
        }
        if(previous[Math.floorMod(row, size)][Math.floorMod(col-1, size)] == 1){
            neighbors++;
        }
        if(previous[Math.floorMod(row, size)][Math.floorMod(col+1, size)] == 1){
            neighbors++;
        }
        if(previous[Math.floorMod(row+1, size)][Math.floorMod(col, size)] == 1){
            neighbors++;
        }
        if(previous[Math.floorMod(row+1, size)][Math.floorMod(col-1, size)] == 1){
            neighbors++;
        }
        if(previous[Math.floorMod(row+1, size)][Math.floorMod(col+1, size)] == 1){
            neighbors++;
        }
       return neighbors;
    }
}
