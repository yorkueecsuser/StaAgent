class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            do {
                synchronized(this) {
                    if (baz == null) {
                        baz = new Object();
                    }
                }
            } while (false); // This do-while loop is equivalent to the if statement
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}