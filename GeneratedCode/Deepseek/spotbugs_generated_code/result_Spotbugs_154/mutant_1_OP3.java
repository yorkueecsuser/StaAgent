class Singleton {
    private static Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            if (isUnreachable()) { // Unreachable if statement
                System.out.println("This statement is unreachable");
            }
        }
        return instance;
    }

    // Method that always returns false
    private static boolean isUnreachable() {
        return false;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }
}