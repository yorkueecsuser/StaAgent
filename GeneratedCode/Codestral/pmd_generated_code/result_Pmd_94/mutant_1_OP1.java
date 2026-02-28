import java.util.Random;

class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking
    int deadStore; // Dead store mutation

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                    deadStore = generateRandomInt(); // Using the dead store
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt();
    }
}