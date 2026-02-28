class SingletonExample {
    private static SingletonExample instance;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR) 
    public SingletonExample() {
        if (instance!= null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static SingletonExample getInstance() {
        if (a == null) {
            a = new SingletonExample();
        }
        return a;
    }

    public void showBug() {
        // This method demonstrates the bug by allowing creation of another instance
        SingletonExample b = new SingletonExample();
        System.out.println("New instance created: " + b);
    }

    public static void main(String[] args) {
        SingletonExample c = SingletonExample.getInstance();
        System.out.println("Original instance: " + c);
        
        // Demonstrating the bug
        c.showBug();
    }
}