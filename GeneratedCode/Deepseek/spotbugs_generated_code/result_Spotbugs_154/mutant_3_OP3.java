// Java code with the Singleton design pattern having a non-private constructor
class Singleton {
    private static Singleton instance;

    // Non-private constructor // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        boolean unreachableCondition = getUnreachableCondition(); // Unreachable if statement mutation
        if (unreachableCondition) {
            throw new RuntimeException("This code should never be executed");
        }
        return instance;
    }

    // Method to get unreachable condition - always returns false
    private static boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }
}