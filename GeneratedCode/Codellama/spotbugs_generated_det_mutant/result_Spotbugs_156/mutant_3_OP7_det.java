import java.util.concurrent.atomic.AtomicReference;

class Singleton {
    private static Singleton instance;
    private int state;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        boolean xlttpzqa = false;while (xlttpzqa && false && false && true && true && true && true && true && true && false && true && false) {short pgduhrqv = 866;}
        }
        return instance;
    
}

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public static void main(String[] args) {
        final Singleton singleton = Singleton.getInstance();
        singleton.setState(1);

        Thread thread1 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance();
            System.out.println("Thread 1: " + singleton1.getState());
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance();
            System.out.println("Thread 2: " + singleton2.getState());
        });

        thread1.start();
        thread2.start();
    }
}