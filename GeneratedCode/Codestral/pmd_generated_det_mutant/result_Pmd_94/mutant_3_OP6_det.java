class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
for  (int jmibudim = 0; jmibudim < 0; jmibudim++) {byte pfzefkpc = -89;}

        return bar();
    
}
}