class SingletonExample {

    // Static instance of the singleton
    private static SingletonExample instance;
    
    // Public constructor - this is the bug
    public SingletonExample() { // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
        // Initialization code
    }

    // Static method to provide access to the instance
    public static SingletonExample getInstance() {
        boolean condition = getCondition(); // Non-final variable to ensure no compile-time constant is used
        if (condition) { // Unreachable if-else branch
            System.out.println("This branch is unreachable but syntactically correct.");
        } else {
            System.out.println("Executing the else branch as condition is false.");
        }
        
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // Method to demonstrate the bug
    public String showBug() {
        // This should not be possible in a properly implemented singleton
        SingletonExample anotherInstance = new SingletonExample();
        return "Singleton instance: " + instance + ", Another instance: " + anotherInstance;
    }

    // Helper method to simulate a condition
    private static boolean getCondition() {
        return false; // Ensures the if condition is always false
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}