class SingletonExample {
    private static SingletonExample instance;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR) 
    public SingletonExample() {
        if (instance!= null) {
            throw new IllegalStateException("Already instantiated");
        }
        // Mutated code: Adding an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never run because shouldRun is always false");
        } else {
            System.out.println("This will also never run because shouldRun is always false");
        }
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void showBug() {
        // This method demonstrates the bug by allowing creation of another instance
        SingletonExample newInstance = new SingletonExample();
        System.out.println("New instance created: " + newInstance);
    }

    public static void main(String[] args) {
        SingletonExample originalInstance = SingletonExample.getInstance();
        System.out.println("Original instance: " + originalInstance);
        
        // Demonstrating the bug
        originalInstance.showBug();
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}