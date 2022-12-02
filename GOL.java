import java.util.Scanner;

/**
 * Name: Davis, Edward
 * File: GOL.java
 * Description: Conway's game of life.
 */
public class GOL extends Board {
    final char ALIVE = '*';
    final char DEAD = ' ';

    public GOL(String filepath) {

        // call the parent's (board) constructor and pass it the path.
        super(filepath);

    }

    public void evolve() {
        char[][] nextGen = this.getCopy();
        for (int i = 0; i <= cells.length; i++) {
            for (int j = 0; j <= cells[i].length; i++) {

            }
        }
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
        // for a given cell i, j, return how many of its neighbours are alive.
        for (i = 0; i <= cells.length; i++) {
            for (j = 0; j <= cells[i].length; j++) {
                // Use the this.isAlive(i, j) to determine whether a cell is alive.
                if (this.isAlive(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isAlive(int i, int j) {
        // you can determine whether a cell is alive by comparing it's
        // character with this.ALIVE.
        for (i = 0; i < cells.length; i++) {
            for (j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == this.ALIVE) {
                    return isAlive;
                }
            }
        }
    }
}