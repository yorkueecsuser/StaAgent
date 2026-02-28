class SingletonExample {

    private static SingletonExample instance = null;

    private SingletonExample() {
        // Private constructor to prevent instantiation
    }

    public static SingletonExample getInstance() {
        synchronized(SingletonExample.class) {
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
        }
    }

    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        System.out.println("Two instances are the same: " + (obj1 == obj2));

        // Adding unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This will never be printed.");
        }
    }

    public boolean showBug() {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        return obj1 == obj2;
    }

    // Mock condition method to comply with guidelines
    private static boolean getCondition() {
        return false;
    }
}