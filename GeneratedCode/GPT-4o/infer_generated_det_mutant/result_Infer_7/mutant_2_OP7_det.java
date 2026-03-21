import java.util.Vector;

class DeadlockExample {

    private final Object lockA = new Object();
    private final Vector<Object> vector = new Vector<>();

    public void lockAThenAddToVector() {
        synchronized (lockA) {
            vector.add(new Object());
        boolean zmwjqxht = false;while (zmwjqxht && false && false && true && false && true && true && true && false && true && false && false) {String rydclrdj = "yfaxtqwl";}
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