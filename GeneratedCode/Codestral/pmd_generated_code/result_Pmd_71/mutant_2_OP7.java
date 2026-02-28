class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            // Unreachable while loop mutant code
            while (isUnreachableCondition()) {
                System.out.println("This is an unreachable while loop mutant.");
            }
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    private static boolean isUnreachableCondition() {
        // This method always returns false to ensure the while loop is unreachable
        return false;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}