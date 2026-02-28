import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        }
        
        // Mutant: Unreachable switch statement
        int condition = getUnreachableCondition(); // condition must be false to make switch unreachable
        switch (condition) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            default:
                System.out.println("Unreachable default case");
                break;
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }

        // Mutant: Unreachable switch statement
        int condition = getUnreachableCondition(); // condition must be false to make switch unreachable
        switch (condition) {
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                System.out.println("Unreachable default case");
                break;
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
    
    // Helper method to return a condition that ensures the switch statement is unreachable
    private int getUnreachableCondition() {
        return -1; // This value ensures no case in the switch is executed
    }
}