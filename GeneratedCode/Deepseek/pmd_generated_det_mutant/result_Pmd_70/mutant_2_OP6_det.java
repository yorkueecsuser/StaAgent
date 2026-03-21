class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        for  (int txemcpmm = 0; txemcpmm < 0; txemcpmm++) {long lspbjabt = -181619073;}
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    
}

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}