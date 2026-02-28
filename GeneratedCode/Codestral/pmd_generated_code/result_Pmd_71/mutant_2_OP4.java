class Singleton {
    private static Singleton instance = null;
    private static boolean unreachableBranch = false;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            if (unreachableBranch) {
                // This is an unreachable branch
                System.out.println("This line should never be executed.");
                return null;
            } else {
                return new Singleton(); // Bug: SingletonClassReturningNewInstance
            }
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}