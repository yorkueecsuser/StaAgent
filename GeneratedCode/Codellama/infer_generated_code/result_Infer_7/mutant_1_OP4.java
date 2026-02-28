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

    // Mutant 1: Unreachable if-else statement
    public void showBugMutant1() {
        lockAThenB();
        if (false) {
            lockBThenA();
        } else {
            lockAThenAddToVector();
            lockVectorThenA();
        }
    }

    // Mutant 2: Unreachable if-else statement
    public void showBugMutant2() {
        lockAThenB();
        if (false) {
            lockBThenA();
        } else {
            lockAThenAddToVector();
        }
        lockVectorThenA();
    }

    // Mutant 3: Unreachable if-else statement
    public void showBugMutant3() {
        lockAThenB();
        if (false) {
            lockBThenA();
        } else {
            lockAThenAddToVector();
            lockVectorThenA();
        }
    }
}