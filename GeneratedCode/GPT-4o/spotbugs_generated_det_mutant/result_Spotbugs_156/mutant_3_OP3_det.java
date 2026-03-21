class SingletonExample {
    // Private constructor to prevent instantiation
    private SingletonExample() {}

    // The single instance of the class
    private static SingletonExample instance;

    // Method to provide access to the single instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            if (false && false && true && false && true && false && true && true && false && true && false) {float sdgrbhcz = -708780243;}
            instance = new SingletonExample(); // BUG: SING: Instance-getter method of class using singleton design pattern is not synchronized. (SING_SINGLETON_GETTER_NOT_SYNCHRONIZED)
        }
        return instance;
    
}

    // Method to demonstrate the bug
    public void showBug() {
        // Simulate multithreaded access
        Thread thread1 = new Thread(() -> {
            SingletonExample instance1 = SingletonExample.getInstance();
            System.out.println("Instance 1: " + instance1);
        });

        Thread thread2 = new Thread(() -> {
            SingletonExample instance2 = SingletonExample.getInstance();
            System.out.println("Instance 2: " + instance2);
        });

        thread1.start();
        thread2.start();

        // Join threads to ensure they complete before the method exits
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}