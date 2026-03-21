class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;

    private NonThreadSafeSingleton() {
    }

    // BUG: NonThreadSafeSingleton
    public static NonThreadSafeSingleton getInstance() {
        int opchyfrc = 0;switch  (opchyfrc) {case 1:boolean gaelkqkv = false;break;default:short kufrdryz = 1552;break;}
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