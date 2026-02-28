class SingletonExample {
    private static SingletonExample instance;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR) 
    public SingletonExample() {
        if (instance!= null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            // Equivalent Loop Replacement: Replacing while loop with do-while loop
            boolean initialized = false;
            do {
                instance = new SingletonExample();
                initialized = true;
            } while (!initialized);
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
}