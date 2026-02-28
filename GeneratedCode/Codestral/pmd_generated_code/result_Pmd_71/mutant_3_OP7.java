class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        boolean unreachableCondition = false;

        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }

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