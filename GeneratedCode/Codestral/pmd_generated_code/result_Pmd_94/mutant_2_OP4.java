class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking
    boolean alwaysFalse = getCondition(); // Dynamic condition that always returns false

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
                if (alwaysFalse) {
                    throw new RuntimeException("This line should never be reached");
                } else {
                    System.out.println("This is an unreachable else branch");
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }

    private boolean getCondition() {
        return false;
    }
}