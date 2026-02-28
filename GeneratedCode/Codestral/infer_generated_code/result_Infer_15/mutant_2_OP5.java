import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count = 0;

    public void increment() {
        count++;

        // Mutated code: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code will never execute
                    System.out.println("Unreachable switch statement executed!");
                    break;
            }
        }
    }

    // Rest of the code remains the same

    private int getValue() {
        return 0; // This makes the switch statement unreachable
    }

    // Rest of the code remains the same
}