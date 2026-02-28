class SingletonExample {
    private static SingletonExample instance;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR) 
    public SingletonExample() {
        if (instance!= null) {
            throw new IllegalStateException("Already instantiated");
        }
        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block in the constructor.");
        } else {
            System.out.println("This is the reachable else block in the constructor.");
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