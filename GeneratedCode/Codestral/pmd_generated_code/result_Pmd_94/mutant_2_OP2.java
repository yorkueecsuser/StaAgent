class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                    baz = new Object(); // MUTATION: Duplication of assignment
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}