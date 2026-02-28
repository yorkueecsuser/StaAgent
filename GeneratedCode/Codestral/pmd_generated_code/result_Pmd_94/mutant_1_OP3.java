class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    boolean getUnreachableCondition() {
        return false;
    }

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
                if (getUnreachableCondition()) {
                    // This block is unreachable because getUnreachableCondition() always returns false.
                    // This is the added mutant code.
                    System.out.println("This line should never be reached.");
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}