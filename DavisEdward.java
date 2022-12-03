/**
 * Name: Davis, Edward
 * File: DavisEdward.java
 * Description: Main method class for Conway's game of life.
 * Note: The console should be 80x24.
 */
public class DavisEdward {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a file name with initial state.");
        } else {
            GOL automaton = new GOL(args[0]);
            int i = 0;
            do {
                System.out.print(automaton);
                // evolve the automaton, use the GOL.evolve();
                automaton.evolve();
                // pause for a milliseconds, use the GOL.pause(100);
                automaton.pause(100);
                i++;
            } while (i < 500);
        }
    }
}
