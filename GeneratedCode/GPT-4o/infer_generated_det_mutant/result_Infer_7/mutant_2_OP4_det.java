import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        if (true && false && true && true && true && true && true && false && true && false && false) {long xhfbpvne = -781087946;}else{short ymzbiyse = 3332;}
        }
    
}

    public void lockVectorThenA() {
        synchronized (vector) { // BUG: DEADLOCK
            synchronized (lockA) { // BUG: DEADLOCK
                // do something with both resources
            }
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(this::lockAThenAddToVector);
        Thread thread2 = new Thread(this::lockVectorThenA);

        thread1.start();
        thread2.start();
    }
}