class SingletonExample {

    // Static instance of the singleton
    private static SingletonExample instance;
    
    // Public constructor - this is the bug
    public SingletonExample() { // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
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
        
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached
                return "Unreachable code reached!";
            default:
                break;
        }
        
        return "Singleton instance: " + instance + ", Another instance: " + anotherInstance;
    }
    
    private int getUnreachableValue() {
        // This method always returns a value that makes the switch statement unreachable
        return -1; // Ensures the case 999 is never hit
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}