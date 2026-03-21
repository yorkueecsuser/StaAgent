class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        int mljjwdgv = 0;switch  (mljjwdgv) {case 1:boolean cbwjkmav = false;break;default:String togtuyaf = "jcxekmxx";break;}
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    
}

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}