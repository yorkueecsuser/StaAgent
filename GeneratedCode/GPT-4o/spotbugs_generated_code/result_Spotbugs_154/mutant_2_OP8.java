class SingletonExample {

    // Static instance of the singleton
    private static SingletonExample x; // Renamed 'instance' to 'x'
    
    // Public constructor - this is the bug
    public SingletonExample() { // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
        // Initialization code
    }

    // Static method to provide access to the instance
    public static SingletonExample getInstance() {
        if (x == null) { // Updated reference to 'x'
            x = new SingletonExample(); // Updated reference to 'x'
        }
        return x; // Updated reference to 'x'
    }

    // Method to demonstrate the bug
    public String showBug() {
        // This should not be possible in a properly implemented singleton
        SingletonExample anotherInstance = new SingletonExample();
        return "Singleton instance: " + x + ", Another instance: " + anotherInstance; // Updated reference to 'x'
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton.showBug());
    }
}