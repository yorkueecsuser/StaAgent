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
        Singleton i = Singleton.getInstance();
        Singleton j = Singleton.getInstance();
        System.out.println("Are instances equal? " + (i == j));
    }
}