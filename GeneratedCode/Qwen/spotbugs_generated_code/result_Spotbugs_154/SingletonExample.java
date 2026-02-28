class SingletonExample {
    private static SingletonExample instance;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR) 
    public SingletonExample() {
        if (instance!= null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static SingletonExample getInstance() {
        if (x == null) {
            x = new SingletonExample();
        }
        return x;
    }

    public void showBug() {
        // This method demonstrates the bug by allowing creation of another instance
        SingletonExample y = new SingletonExample();
        System.out.println("New instance created: " + y);
    }

    public static void main(String[] args) {
        SingletonExample z = SingletonExample.getInstance();
        System.out.println("Original instance: " + z);
        
        // Demonstrating the bug
        z.showBug();
    }
}