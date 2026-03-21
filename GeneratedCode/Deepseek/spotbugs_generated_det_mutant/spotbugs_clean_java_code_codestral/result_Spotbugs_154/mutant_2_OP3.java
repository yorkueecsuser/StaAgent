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
        // Mutated code: Unreachable if statement
        if (isUnreachableCondition()) {
            Singleton unreachableInstance = new Singleton();
            System.out.println("Unreachable code executed");
        }
        return instance;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }

    private static boolean isUnreachableCondition() {
        return false;   // This condition is always false, making the if statement unreachable
    }
}