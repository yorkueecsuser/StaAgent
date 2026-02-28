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

    // Mutant 1: Renaming of lockA
    private final Object lockX = new Object();

    public void lockXThenB() {
        synchronized(lockX) {
            synchronized(lockB) {
                // do something with both resources
            }
        }
    }

    public void lockBThenX() {
        synchronized(lockB) {
            synchronized(lockX) {
                // do something with both resources
            }
        }
    }

    public void lockXThenAddToVector() {
        synchronized(lockX) {
            vector.add(new Object());
        }
    }

    public void lockVectorThenX() {
        synchronized(vector) {
            synchronized(lockX) {
                // do something with both resources
            }
        }
    }

    public void showBugMutant1() {
        lockXThenB();
        lockBThenX();
        lockXThenAddToVector();
        lockVectorThenX();
    }

    // Mutant 2: Renaming of lockB
    private final Object lockY = new Object();

    public void lockAThenY() {
        synchronized(lockA) {
            synchronized(lockY) {
                // do something with both resources
            }
        }
    }

    public void lockYThenA() {
        synchronized(lockY) {
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

    public void showBugMutant2() {
        lockAThenY();
        lockYThenA();
        lockAThenAddToVector();
        lockVectorThenA();
    }

    // Mutant 3: Renaming of vector
    private Vector<Object> vectorZ = new Vector<>();

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

    public void lockAThenAddToVectorZ() {
        synchronized(lockA) {
            vectorZ.add(new Object());
        }
    }

    public void lockVectorZThenA() {
        synchronized(vectorZ) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    public void showBugMutant3() {
        lockAThenB();
        lockBThenA();
        lockAThenAddToVectorZ();
        lockVectorZThenA();
    }
}