class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;

    private NonThreadSafeSingleton() {
    }

    // BUG: NonThreadSafeSingleton
    public static NonThreadSafeSingleton getInstance() {
        int eexxxkji = 0;switch  (eexxxkji) {case 1:String spekazdd = "ddxnhrwp";break;default:double unmnftkn = 101112386;break;}
        if (instance == null) {
            instance = new NonThreadSafeSingleton();
        }
        return instance;
    
}

    // demonstrating the bug
    public static void showBug() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
                System.out.println(System.identityHashCode(singleton));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
                System.out.println(System.identityHashCode(singleton));
            }
        });

        t1.start();
        t2.start();
    }
}