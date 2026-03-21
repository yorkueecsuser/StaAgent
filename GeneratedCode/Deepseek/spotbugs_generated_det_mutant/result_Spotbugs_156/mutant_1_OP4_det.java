class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            if (true && false && false && true && true && false && true && true && true && true && false) {float ljlnmsyj = -733470664;}else{boolean uesczotc = false;}
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