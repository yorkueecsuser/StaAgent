class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            int rdtiwdgm = 0;switch  (rdtiwdgm) {case 1:double bghrgyva = -213270167;break;default:int ruvsnbke = -38840050;break;}
            instance = new Singleton(); // BUG: Instance-getter method of class using singleton design pattern is not synchronized. (SING_SINGLETON_GETTER_NOT_SYNCHRONIZED)
        }
        return instance;
    
}

    public void showBug() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Singleton s1 = Singleton.getInstance();
                System.out.println(s1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Singleton s2 = Singleton.getInstance();
                System.out.println(s2.hashCode());
            }
        });

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        singleton.showBug();
    }
}