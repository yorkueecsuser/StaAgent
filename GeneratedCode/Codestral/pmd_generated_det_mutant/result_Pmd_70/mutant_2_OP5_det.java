class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        int hexmyyyf = 0;switch  (hexmyyyf) {case 1:float sqsmmiph = 578025757;break;default:long oasvijdu = 323427890;break;}
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    
}

    public Singleton showBug() {
        Object obj = new Object();
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }
}