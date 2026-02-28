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

    // Mutant 1: Unreachable if statement in lockAThenB()
    public void lockAThenB() {
        synchronized(lockA) {
            boolean condition = getCondition();
            if (condition) {
                synchronized(lockB) {
                    // do something with both resources
                }
            }
        }
    }

    // Mutant 2: Unreachable if statement in lockBThenA()
    public void lockBThenA() {
        synchronized(lockB) {
            boolean condition = getCondition();
            if (condition) {
                synchronized(lockA) {
                    // do something with both resources
                }
            }
        }
    }

    // Mutant 3: Unreachable while loop in lockAThenAddToVector()
    public void lockAThenAddToVector() {
        synchronized(lockA) {
            boolean condition = getCondition();
            while (condition) {
                vector.add(new Object());
            }
        }
    }

    // Mutant 4: Unreachable for loop in lockVectorThenA()
    public void lockVectorThenA() {
        synchronized(vector) {
            boolean condition = getCondition();
            for (int i = 0; condition; i++) {
                synchronized(lockA) {
                    // do something with both resources
                }
            }
        }
    }

    // Helper method to get a dynamic condition for the mutants
    private boolean getCondition() {
        return Math.random() < 0.5;
    }
}