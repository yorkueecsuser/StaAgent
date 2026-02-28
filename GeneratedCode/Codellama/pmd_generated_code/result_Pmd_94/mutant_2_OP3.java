import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        DoubleCheckedLocking obj = getInstance();
        System.out.println(obj);
    }
}

// Mutant 1: Unreachable if statement
class DoubleCheckedLockingMutant1 {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLockingMutant1() {}

    public static DoubleCheckedLockingMutant1 getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingMutant1.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingMutant1(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        if (false) {
            DoubleCheckedLockingMutant1 obj = getInstance();
            System.out.println(obj);
        }
    }
}

// Mutant 2: Unreachable while loop
class DoubleCheckedLockingMutant2 {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLockingMutant2() {}

    public static DoubleCheckedLockingMutant2 getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingMutant2.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingMutant2(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        while (false) {
            DoubleCheckedLockingMutant2 obj = getInstance();
            System.out.println(obj);
        }
    }
}

// Mutant 3: Unreachable for loop
class DoubleCheckedLockingMutant3 {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLockingMutant3() {}

    public static DoubleCheckedLockingMutant3 getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingMutant3.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingMutant3(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        for (int i = 0; false; i++) {
            DoubleCheckedLockingMutant3 obj = getInstance();
            System.out.println(obj);
        }
    }
}

// Mutant 4: Unreachable if-else statement
class DoubleCheckedLockingMutant4 {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLockingMutant4() {}

    public static DoubleCheckedLockingMutant4 getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingMutant4.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingMutant4(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        if (false) {
            DoubleCheckedLockingMutant4 obj = getInstance();
            System.out.println(obj);
        } else {
            // do something else
        }
    }
}

// Mutant 5: Unreachable switch statement
class DoubleCheckedLockingMutant5 {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLockingMutant5() {}

    public static DoubleCheckedLockingMutant5 getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingMutant5.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingMutant5(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        switch (0) {
            case 1:
                DoubleCheckedLockingMutant5 obj = getInstance();
                System.out.println(obj);
                break;
            default:
                // do nothing
        }
    }
}