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

        // Unreachable switch statement example
        int condition = getUnreachableCondition();
        switch (condition) {
            case 1:
                System.out.println("This block is unreachable.");
                break;
            default:
                System.out.println("Default case.");
        }
    }

    public boolean showBug() {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        return obj1 == obj2;
    }

    // Method to ensure the switch condition is always unreachable
    private static int getUnreachableCondition() {
        return 0;
    }
}