import java.util.Vector;

class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private final Vector<String> vector = new Vector<>();

    // Mutant 1: Using non-final variable for synchronized block
    public void lockAThenB_Mutant1() {
        synchronized(lockA) {
            synchronized(lockB) {
                // do something with both resources
            }
        }
    }

    public void lockBThenA_Mutant1() {
        synchronized(lockB) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    // Mutant 2: Using non-final variable for synchronized block
    public void lockAThenAddToVector_Mutant2() {
        synchronized(lockA) {
            vector.add("object");
        }
    }

    // Mutant 3: Using non-final variable for synchronized block
    public void lockVectorThenA_Mutant3() {
        synchronized(vector) {
            synchronized(lockA) {
                // do something with both resources
            }
        }
    }

    // Mutant 4: Adding unreachable if statement
    public void addToVectorThenLockA_Mutant4() {
        vector.add("object");
        synchronized(lockA) {
            if(false){
                // do nothing
            }
            // do something with both resources
        }
    }

    // Mutant 5: Adding unreachable if statement
    public String showBug_Mutant5() {
        Thread thread1 = new Thread(this::addToVectorThenLockA_Mutant4);
        Thread thread2 = new Thread(this::lockVectorThenA_Mutant3);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(false){
            return "";
        }
        return "Deadlock occurred";
    }
}