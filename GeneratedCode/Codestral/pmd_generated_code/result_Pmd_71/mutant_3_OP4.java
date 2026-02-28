class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // Unreachable if-else statement mutant
                System.out.println("Unreachable branch executed!");
                return new Singleton();
            } else {
                return new Singleton(); // Original code
            }
        }
    }

    private static boolean getUnreachableCondition() {
        // This method should always return false to make the if-else branch unreachable
        return false;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}