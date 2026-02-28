class SingletonExample {

    // Static instance of the singleton
    private static SingletonExample instance;
    
    // Public constructor - this is the bug
    public SingletonExample() { // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
        // Initialization code
    }

    // Static method to provide access to the instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }

        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("Unreachable code!");
        } else {
            // This is the reachable part
            System.out.println("Reached else part!");
        }

        return instance;
    }

    // Method to demonstrate the bug
    public String showBug() {
        // This should not be possible in a properly implemented singleton
        SingletonExample anotherInstance = new SingletonExample();
        return "Singleton instance: " + instance + ", Another instance: " + anotherInstance;
    }

    // Dummy method to provide a condition, ensuring no compile-time constant is used
    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}