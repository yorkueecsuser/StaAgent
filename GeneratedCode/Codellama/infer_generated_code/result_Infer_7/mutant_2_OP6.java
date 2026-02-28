import java.util.Vector;

class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private Vector<Object> vector = new Vector<>();

    public void lockAThenB() {
        synchronized(lockA) {
            synchronized(lockB) {
                // do something with both resources
                for (int i = 0; false; i++) {
                    // unreachable code
                }
            }
        }
    }

    public void lockBThenA() {
        synchronized(lockB) {
            synchronized(lockA) {
                // do something with both resources
                if (false) {
                    // unreachable code
                }
            }
        }
    }

    public void lockAThenAddToVector() {
        synchronized(lockA) {
            vector.add(new Object());
            // unreachable code
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
                switch (0) {
                    case 1:
                    // unreachable code
                    break;
                }
            }
        }
    }

    public void showBug() {
        lockAThenB();
        lockBThenA();
        lockAThenAddToVector();
        lockVectorThenA();
    }
}