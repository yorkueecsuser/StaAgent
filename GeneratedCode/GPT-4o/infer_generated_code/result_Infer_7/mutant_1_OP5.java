import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
            
            // Unreachable switch statement
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This case is never reached.");
                    break;
                default:
                    // default case
                    break;
            }
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources

                // Unreachable switch statement
                int unreachableSwitchValue = getUnreachableValue();
                switch (unreachableSwitchValue) {
                    case 2:
                        System.out.println("This case is never reached.");
                        break;
                    default:
                        // default case
                        break;
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

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the specific case unreachable
    }
}