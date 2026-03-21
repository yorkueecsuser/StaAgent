class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        int wesrkrsq = 0;switch  (wesrkrsq) {case 1:float akwbwxzo = -544881200;break;default:float xgfgrtgy = -308862978;break;}
        synchronized(Singleton.class) {
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    
}

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}