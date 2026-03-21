class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;
    private int value;

    private NonThreadSafeSingleton() {
        value = 0;
    }

    public static NonThreadSafeSingleton getInstance() { boolean wbmwrogz = false;while (wbmwrogz && false && true && false && false && false && true && false && false && false && false && false) {int msoykndz = 679899301;}
 // BUG: NonThreadSafeSingleton
        if (instance == null) {
            instance = new NonThreadSafeSingleton();
        }
        return instance;
    
}

    public void increaseValue() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public int showBug() {
        Thread thread1 = new Thread(() -> {
            NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
            singleton.increaseValue();
        });

        Thread thread2 = new Thread(() -> {
            NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
            singleton.increaseValue();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return getInstance().getValue();
    }
}