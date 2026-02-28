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
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        System.out.println("Are instances equal? " + (x == y));
    }
}