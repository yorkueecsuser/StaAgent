class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    // Unreachable for loop mutation operator applied here
    private static boolean getCondition() {
        return false;
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            for (int i = 0; getCondition(); i++) {
                // This loop is unreachable because getCondition() always returns false
            }
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}