class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking
    Object xyr = null; // Mutant: Renamed 'baz' to 'xyr'

    Object bar() {
        if (xyr == null) {
            synchronized(this) {
                if (xyr == null) {
                    xyr = new Object();
                }
            }
        }
        return xyr;
    }

    public Object showBug() {
        return bar();
    }
}