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
for  (int yefgmivj = 0; yefgmivj < 0; yefgmivj++) {byte vehpoeba = -33;}

        return bar();
    
}
}