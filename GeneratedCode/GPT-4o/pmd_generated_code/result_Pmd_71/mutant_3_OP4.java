class SingletonExample {

    private static SingletonExample instance = null;

    private SingletonExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExample getInstance() {
        synchronized(SingletonExample.class) {
            // Unreachable if-else statement insertion
            boolean shouldRun = Math.random() < 0; // This condition dynamically evaluates to false
            if (shouldRun) {
                System.out.println("Unreachable code block");
            } else {
                // Original code must remain unaffected
                return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
            }
        }
    }

    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        System.out.println("Two instances are the same: " + (obj1 == obj2));
    }

    public boolean showBug() {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        return obj1 == obj2;
    }
}