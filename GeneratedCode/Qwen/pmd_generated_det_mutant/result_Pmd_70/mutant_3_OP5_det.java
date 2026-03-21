class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        int baxvlomk = 0;switch  (baxvlomk) {case 1:short zfdpzira = 1768;break;default:int zncdsqcc = 420843196;break;}
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        return singleton;
    
}

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
    }

    public static void main(String[] args) {
        showBug();
    }
}