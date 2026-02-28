class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    boolean getFalseCondition() {
        return false;
    }

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                while (getFalseCondition()) {
                    // Unreachable code
                    System.out.println("This is an unreachable loop");
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