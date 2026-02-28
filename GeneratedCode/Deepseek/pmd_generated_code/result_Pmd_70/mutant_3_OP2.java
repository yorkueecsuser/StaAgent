class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    }

    // Duplicated code from above
    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}