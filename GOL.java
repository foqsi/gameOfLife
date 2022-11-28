package gol;
/**
 * Name: Davis, Edward
 * File: GOL.java
 * Description: Conway's game of life.
 */
public class GOL /* extend the provided board class here. */ {
    final char ALIVE = '*';
    final char DEAD = ' ';

    public GOL(String filepath) {
        // call the parent's (Board) constructor and pass it the path.
    }
    
    public void evolve() {
        char[][] nextGen = this.getCopy();
        // write a two dimensional loop that iterates over this.cells
        // and reassigns each state in nextGen according to the
        // current cell's neighbours and game of life's rules. Use the
        // this.countAliveNeighbours(i, j) function.
        this.cells = nextGen;
    }

    public void pause(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private int countAliveNeighbours(int i, int j) {
        int count = 0;
        int rows = this.cells.length, columns = this.cells[0].length;
        // for a given cell i, j, return how many of its neighbours
        // are alive. Use the this.isAlive(i, j) to determine
        // whether a cell is alive.
        return count;
    }

    private boolean isAlive(int i, int j) {
        // you can determine whether a cell is alive by comparing it's
        // character with this.ALIVE.
    }
}