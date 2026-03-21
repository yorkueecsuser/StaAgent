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
for  (int rxwnzpfn = 0; rxwnzpfn < 0; rxwnzpfn++) {String xibwbaiw = "ukoadgdm";}

        return bar();
    
}
}