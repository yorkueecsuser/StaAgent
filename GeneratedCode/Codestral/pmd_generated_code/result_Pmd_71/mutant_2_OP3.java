class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            if (getCondition()) { // Unreachable if statement
                System.out.println("This line will never be executed.");
            }
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    private static boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}