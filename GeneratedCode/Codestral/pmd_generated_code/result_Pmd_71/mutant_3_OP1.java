import java.util.Random;

class Singleton {
    private static Singleton instance = null;
    private static int deadStoreVar; // Dead Store Mutation

    private Singleton() {
        // Private constructor to restrict new instances
        deadStoreVar = new Random().nextInt(); // Initialize the dead store variable
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}