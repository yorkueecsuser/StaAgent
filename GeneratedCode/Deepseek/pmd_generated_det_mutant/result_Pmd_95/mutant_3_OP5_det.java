class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;

    private NonThreadSafeSingleton() {
    }

    // BUG: NonThreadSafeSingleton
    public static NonThreadSafeSingleton getInstance() {
        int klvhcige = 0;switch  (klvhcige) {case 1:int iojalrou = 550601645;break;default:String hikavadv = "qbnmlwvs";break;}
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