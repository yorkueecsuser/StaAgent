// Java code with the Singleton design pattern having a non-private constructor
class Singleton {
    private static Singleton singleInstance;

    // Non-private constructor // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public void showBug() {
        Singleton objA = new Singleton();
        Singleton objB = new Singleton();
        System.out.println("Objects are equal: " + (objA == objB));
    }
}