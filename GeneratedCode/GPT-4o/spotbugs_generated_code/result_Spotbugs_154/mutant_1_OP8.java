class SingletonExample {

    // Static instance of the singleton
    private static SingletonExample x; // Renamed variable 'instance' to 'x'
    
    // Public constructor - this is the bug
    public SingletonExample() { // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
        // Initialization code
    }

    // Static method to provide access to the instance
    public static SingletonExample getInstance() {
        if (x == null) { // Updated to use 'x'
            x = new SingletonExample(); // Updated to use 'x'
        }
        return x; // Updated to use 'x'
    }

    // Method to demonstrate the bug
    public String showBug() {
        // This should not be possible in a properly implemented singleton
        SingletonExample anotherInstance = new SingletonExample();
        return "Singleton instance: " + x + ", Another instance: " + anotherInstance; // Updated to use 'x'
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}