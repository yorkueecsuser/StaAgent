// Java code with the Singleton design pattern having a non-private constructor
class Singleton {
    private static Singleton instance;
    private int unusedVariable; // Mutation: adding a dead store variable

    // Non-private constructor // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        // Using the dead store variable
        unusedVariable = 10;
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }
}