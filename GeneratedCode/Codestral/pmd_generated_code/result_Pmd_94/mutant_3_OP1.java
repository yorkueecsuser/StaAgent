class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking
    int deadStoreVariable; // Mutation: Dead Store

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                    deadStoreVariable = 1; // Unused assignment in dead store mutation
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}