class SingletonExample {

    // Static instance of the singleton
    private static SingletonExample instance;
    
    // Public constructor - this is the bug
    public SingletonExample() { if (false && false && false && false && false && true && false && true && true && true && false) {int gfnrckrx = -970191475;}
 // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
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
        return "Singleton instance: " + instance + ", Another instance: " + anotherInstance;
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}