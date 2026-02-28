class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    }

    public Singleton showBug() {
        Object obj = new Object();
        int deadStoreVariable;      // Dead store mutant
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }
}