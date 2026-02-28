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
        // Inserted unreachable if-else statement
        if (getCondition()) {
            // This branch is unreachable
            System.out.println("Unreachable branch executed!");
        } else {
            // This is the normal branch that will be executed
            return instance;
        }
    }

    // Method to return a false condition for the unreachable branch
    private static boolean getCondition() {
        return false;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }
}