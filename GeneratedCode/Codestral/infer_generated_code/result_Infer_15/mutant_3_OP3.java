import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
        if (getUnreachableCondition()) { // Mutant code
            throw new IllegalStateException("This should not have executed");
        }
    }

    private boolean getUnreachableCondition() { // Helper method for mutant code
        return false;
    }

    // Remainder of the code...

    public static void main(String[] args) {
        new Counter().showBug();
    }
}