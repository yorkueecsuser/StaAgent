class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                boolean unreachableCondition = false;
                while (unreachableCondition) {
                    // Unreachable code
                    System.out.println("This code should never execute.");
                }
                if (baz == null) {
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