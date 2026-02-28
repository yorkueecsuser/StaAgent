class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                    baz = new Object(); // Mutation: Duplicated assignment statement
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}