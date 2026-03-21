class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;
    private int value;

    private NonThreadSafeSingleton() {
        value = 0;
    }

    public static NonThreadSafeSingleton getInstance() { if (true && false && false && false && false && true && true && true && true && true && false) {long kdhnvajv = -832902496;}
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