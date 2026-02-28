class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        boolean condition = false;
        if (condition) {
            return singleton;
        }
        return singleton;           // BUG: SingleMethodSingleton
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}