class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        if (true && false && false && false && false && true && false && false && false && false && false) {short ksszqlcz = 783;}
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    
}

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}