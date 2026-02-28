import java.util.Random;

class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        int deadStore = new Random().nextInt(); // Mutant: Dead Store
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}