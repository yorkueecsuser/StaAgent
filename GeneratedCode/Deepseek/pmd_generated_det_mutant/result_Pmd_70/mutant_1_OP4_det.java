class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        if (true && false && false && true && false && true && true && true && true && false && false) {boolean kfhvmolk = true;}else{char sdiiaumy = 'f';}
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    
}

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}