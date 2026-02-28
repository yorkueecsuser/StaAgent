class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    // This code will never be reached
                    System.out.println("Unreachable code");
                    break;
            }
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    private static int getUnreachableValue() {
        return -1; // Always returns a value that is not 1
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}