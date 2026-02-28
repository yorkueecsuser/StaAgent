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
        return instance;
    }

    // Method to demonstrate the bug
    public String showBug() {
        // This should not be possible in a properly implemented singleton
        SingletonExample anotherInstance = new SingletonExample();

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                return "This case is unreachable";
            default:
                break; // Default case to ensure no compile error
        }

        return "Singleton instance: " + instance + ", Another instance: " + anotherInstance;
    }

    // Helper method to provide a value that makes the switch unreachable
    private int getUnreachableValue() {
        return 2; // Always returns 2, making the case 1 unreachable
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}