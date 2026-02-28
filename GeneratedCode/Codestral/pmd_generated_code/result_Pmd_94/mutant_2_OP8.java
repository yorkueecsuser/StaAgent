class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking
    Object foo = null; // Mutant: Renamed baz to foo

    Object bar() {
        if (foo == null) {
            synchronized(this) {
                if (foo == null) {
                    foo = new Object();
                }
            }
        }
        return foo;
    }

    public Object showBug() {
        return bar();
    }
}