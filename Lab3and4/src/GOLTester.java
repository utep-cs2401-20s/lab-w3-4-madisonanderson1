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

    @Test
    public void testOneStep1(){
        int[][] array = {
                {0,0,0,0},
                {0,1,0,0},
                {0,0,1,1},
                {0,1,1,1}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testOneStep2(){
        int[][] array = {
                {0,0},
                {0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testOneStep3(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testOneStep4(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testOneStep5(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,1,1,0,0,0},
                {0,1,1,0,0,0},
                {0,0,0,1,1,0},
                {0,0,0,1,1,0},
                {0,0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testEvolution1(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.evolution(1);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testEvolution2(){
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

    @Test
    public void testEvolution3(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.evolution(2);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testEvolution4(){
        int[][] array = {{0,0,0,0,0,0},
                {0,1,1,0,0,0},
                {0,1,1,0,0,0},
                {0,0,0,1,1,0},
                {0,0,0,1,1,0},
                {0,0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.evolution(2);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testEvolution5(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        GameOfLife test = new GameOfLife(array);
        test.printPrevious();
        test.evolution(2);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusNeighbors1(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        assertEquals(2, test.neighbors(2,0));
    }

    @Test
    public void testTorusNeighbors2(){
        int[][] array = {
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        assertEquals(0, test.neighbors(0,0));
    }

    @Test
    public void testTorusNeighbors3(){
        int[][] array = {{0,0,0,0,0,0},
                {0,1,1,0,0,0},
                {0,1,1,0,0,0},
                {0,0,0,1,1,0},
                {0,0,0,1,1,0},
                {0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        assertEquals(2, test.neighbors(5,3));
    }

    @Test
    public void testTorusNeighbors4(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        assertEquals(2, test.neighbors(1,2));
    }

    @Test
    public void testTorusNeighbors5(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        assertEquals(0, test.neighbors(0,2));
    }

    @Test
    public void testTorusOneStep1(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusOneStep2(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusOneStep3(){
        int[][] array = {
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusOneStep4(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusOneStep5(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.oneStep();
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusEvolution1(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.evolution(2);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusEvolution2(){
        int[][] array = {
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.evolution(3);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusEvolution3(){
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,1,0},
                {0,1,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.evolution(2);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusEvolution4(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.evolution(1);
        System.out.println();
        test.printBoard();
    }

    @Test
    public void testTorusEvolution5(){
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        TorusGameOfLife test = new TorusGameOfLife(array);
        test.printPrevious();
        test.evolution(2);
        System.out.println();
        test.printBoard();
    }
}
