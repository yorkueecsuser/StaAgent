class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                    // Mutation: Duplicate the assignment statement
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