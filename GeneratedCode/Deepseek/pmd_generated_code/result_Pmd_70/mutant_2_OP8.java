class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton1 = (Singleton) obj; // Mutated line: renaming the variable `singleton` to `singleton1`
        return singleton1;        
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}