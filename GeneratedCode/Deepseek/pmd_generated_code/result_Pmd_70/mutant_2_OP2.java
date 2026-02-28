class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        Singleton singleton2 = (Singleton) obj;   // Mutant Code
        return singleton;                         // Original Code
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}