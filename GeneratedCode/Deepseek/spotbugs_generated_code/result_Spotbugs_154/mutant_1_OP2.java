class Singleton {
    private static Singleton instance;

    // Non-private constructor // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton(); // Original line
        Singleton obj3 = new Singleton(); // Mutant: Duplicated line
        System.out.println("Objects are equal: " + (obj1 == obj2) + ", " + (obj2 == obj3));
    }
}