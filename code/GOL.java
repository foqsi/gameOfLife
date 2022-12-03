/**
 * File: GOL.java
 * Description: Conway's game of life.
 */

public class GOL extends Board {
    final char ALIVE = '*';
    final char DEAD = ' ';

    public GOL(String filepath) {
        // call the parent's (Board) constructor and passes path.
        super(filepath);
    }

    public void evolve() {
        char[][] nextGen = this.getCopy();
        // two dimensional loop that iterates over this.cells
        // and reassigns each state in nextGen according to the
        // current cell's neighbours and game of life's rules. 
        int rows = this.cells.length, columns = this.cells[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int aliveNeighbours = countAliveNeighbours(i, j);
                if (aliveNeighbours == 3) {
                    nextGen[i][j] = this.ALIVE;
                } else if (aliveNeighbours != 2) {
                    nextGen[i][j] = this.DEAD;
                }
            }
        }
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
        // are alive. 
        int rowMin = Math.max(i - 1, 0);
        int rowMax = Math.min(i + 1, rows - 1);
        int colMin = Math.max(j - 1, 0);
        int colMax = Math.min(j + 1, columns - 1);

        for (int k = rowMin; k <= rowMax; k++) {
            for (int l = colMin; l <= colMax; l++) {
                if (!(k == i && l == j) && this.isAlive(k, l)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isAlive(int i, int j) {
        // determine whether a cell is alive by comparing it's
        // character with this.ALIVE.
        try {
            return this.ALIVE == this.cells[i][j];
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
