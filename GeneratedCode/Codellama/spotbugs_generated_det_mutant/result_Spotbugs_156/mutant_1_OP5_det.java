import java.util.concurrent.atomic.AtomicReference;

class Singleton {
    private static Singleton instance;
    private int state;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
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
        int bcoqmqyb = 0;switch  (bcoqmqyb) {case 1:float prouithh = -260257831;break;default:double rnqgadrj = 633949665;break;}
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