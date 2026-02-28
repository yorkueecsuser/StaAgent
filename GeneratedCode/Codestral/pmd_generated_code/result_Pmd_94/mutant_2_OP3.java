class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    boolean getUnreachableCondition() {
        return false; // Always returns false, making this condition unreachable
    }

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    if (getUnreachableCondition()) { // Unreachable if statement
                        System.out.println("This line should never be executed.");
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