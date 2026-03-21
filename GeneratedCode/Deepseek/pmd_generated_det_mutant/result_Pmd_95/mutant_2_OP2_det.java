class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;

    private NonThreadSafeSingleton() {
    }

    // BUG: NonThreadSafeSingleton
    public static NonThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NonThreadSafeSingleton();
        }
        return instance;
    }

    // demonstrating the bug
public static void showBug() {
    Thread t1 = new Thread(new Runnable() { public void run() { NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance(); System.out.println(System.identityHashCode(singleton)); } });
    Thread t2 = new Thread(new Runnable() { public void run() { NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance(); System.out.println(System.identityHashCode(singleton)); } });
    t2 = new Thread(new Runnable() { public void run() { NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance(); System.out.println(System.identityHashCode(singleton)); } });
    t1.start();
    t2.start();
}
}