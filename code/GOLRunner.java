public class GOLRunner {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a file name with initial state.");
        } else {
            GOL automaton = new GOL(args[0]);
            int i = 0;
            do {
                System.out.print(automaton);
                automaton.evolve();
                automaton.pause(100);
                i++;
            } while (i < 500);
        }
    }
}
