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
        Object a = new Object(); // Mutation: Renaming 'obj' to 'a'
        Singleton differentSingleton = Singleton.getInstance(a);
        return differentSingleton;
    }
}