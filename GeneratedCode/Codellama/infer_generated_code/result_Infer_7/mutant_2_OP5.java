import java.util.Vector;

class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private Vector<Object> vector = new Vector<>();

    public void lockAThenB() {
        synchronized(lockA) {
            synchronized(lockB) {
                // do something with both resources
            }
        }
    }

    public void lockBThenA() {
        synchronized(lockB) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void lockAThenAddToVector() {
        synchronized(lockA) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenA() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void showBug() {
        lockAThenB();
        lockBThenA();
        lockAThenAddToVector();
        lockVectorThenA();
    }

    // Unreachable switch statement mutant
    public void unreachableSwitchStatement() {
        int value = getValue();
        switch(value) {
            case 0:
                // do something
                break;
            case 1:
                // do something else
                break;
            default:
                // do nothing
                break;
        }
    }
}