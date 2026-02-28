class Singleton {
    private static Singleton instance = null;
    private static int deadStoreVariable; // Mutation: Dead Store

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            deadStoreVariable = 1; // Mutation: Using the dead store variable
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}