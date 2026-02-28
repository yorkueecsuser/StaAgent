import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
    
    // Added unreachable switch statement
    public void unreachableSwitch() {
        int condition = getConditionValue(); // Ensure the condition is dynamically determined
        switch (condition) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            // Unreachable case
            case 3:
                System.out.println("This case is unreachable");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
    
    // Method to simulate dynamic condition for the switch statement
    private int getConditionValue() {
        // This method can return different values, but 3 is never returned making it unreachable
        return (int) (Math.random() * 2) + 1; // Returns 1 or 2
    }
}