class SingletonExample {

    private static SingletonExample instance = null;

    private SingletonExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExample getInstance() {
        synchronized(SingletonExample.class) {
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
        }
    }

    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        System.out.println("Two instances are the same: " + (obj1 == obj2));

        // Inserting an unreachable if-else statement
        boolean condition = computeCondition(); // Simulating a runtime condition
        if (condition) {
            System.out.println("This is never reached");
        } else {
            // This block is always executed
            System.out.println("This is always reached");
        }
    }

    public boolean showBug() {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        return obj1 == obj2;
    }

    // Method to simulate a runtime condition
    private static boolean computeCondition() {
        return false; // This will make the 'if' block unreachable
    }
}