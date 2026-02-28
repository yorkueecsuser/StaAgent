class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton n = Singleton.getInstance();  // Mutant: Renaming 'instance2' to 'n'
        System.out.println("Are instances equal? " + (instance1 == n));
    }
}