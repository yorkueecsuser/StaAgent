class Singleton {
    private static Singleton instance;

    // Non-private constructor with unreachable if-else branch
    public Singleton() {
        if (alwaysFalse()) {
            // This branch is unreachable
            throw new IllegalStateException("Unreachable branch executed");
        }
    }

    // Method that always returns false
    private boolean alwaysFalse() {
        return false;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }
}