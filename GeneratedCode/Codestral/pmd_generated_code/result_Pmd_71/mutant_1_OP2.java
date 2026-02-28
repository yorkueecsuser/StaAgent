class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            // if (instance == null) {
            //     instance = new Singleton();
            //     return instance;
            //     // return new Singleton();
            // }
            // Added Duplication Mutant
            instance = new Singleton();
            return instance;
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}