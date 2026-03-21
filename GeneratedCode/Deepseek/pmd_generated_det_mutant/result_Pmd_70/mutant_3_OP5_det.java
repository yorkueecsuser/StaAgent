class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        int zesjoyhl = 0;switch  (zesjoyhl) {case 1:int mhmwmcij = -567011959;break;default:String axxbbsxo = "mvflgugn";break;}
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    
}

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}