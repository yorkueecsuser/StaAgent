import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
            // Unreachable if-else branch
            boolean condition = getFalseCondition(); // Dynamically determined condition
            if (condition) {
                System.out.println("This will never be printed.");
            } else {
                // This block is always executed, ensuring no unreachable statement error
                System.out.println("Adding object to vector.");
            }
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
                // Unreachable if-else branch
                boolean condition = getFalseCondition(); // Dynamically determined condition
                if (condition) {
                    System.out.println("This will never be printed.");
                } else {
                    // This block is always executed, ensuring no unreachable statement error
                    System.out.println("Locked both resources.");
                }
            }
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }

    // Method to simulate getting a false condition dynamically
    private boolean getFalseCondition() {
        return false; // Dynamically determined at runtime
    }
}