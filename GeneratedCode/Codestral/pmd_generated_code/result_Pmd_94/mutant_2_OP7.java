class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    boolean unreachableCondition = false;
                    while (unreachableCondition) { // Mutant: Unreachable while loop
                        // This block of code is unreachable
                        System.out.println("This code is unreachable.");
                    }
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}