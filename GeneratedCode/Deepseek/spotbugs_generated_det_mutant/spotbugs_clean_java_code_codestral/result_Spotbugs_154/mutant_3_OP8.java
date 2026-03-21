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
        Singleton objA = new Singleton(); // Renamed obj1 to objA
        Singleton objB = new Singleton(); // Renamed obj2 to objB
        System.out.println("Objects are equal: " + (objA == objB));
    }
}