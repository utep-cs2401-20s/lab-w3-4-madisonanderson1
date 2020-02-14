import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class GOLTester {

    @Test
    public void testNeighbors1(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        assertEquals(0, test.neighbors(0,0)); // passed
    }

    @Test
    public void testNeighbors2(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        assertEquals(2, test.neighbors(2,2)); // failed first time but then fixed
    }

    @Test
    public void testNeighbors3(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        assertEquals(4, test.neighbors(2,2)); // failed first time but then fixed
    }

    @Test
    public void testNeighbors4(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        assertEquals(1, test.neighbors(3,0)); // failed first time but then fixed
    }

    @Test
    public void testNeighbors5(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,1,1,0,0,0},
                {0,1,1,0,0,0},
                {0,0,0,1,1,0},
                {0,0,0,1,1,0},
                {0,0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        assertEquals(1, test.neighbors(0,0)); // failed first time but then fixed
    }
    

}
