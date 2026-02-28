class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    boolean unreachableCondition = getUnreachableCondition();
                    for(int i = 0; unreachableCondition; i++) {
                        // This loop is unreachable because getUnreachableCondition() always returns false
                        System.out.println("This is an unreachable loop");
                    }
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}