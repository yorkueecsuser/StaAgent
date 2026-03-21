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
if (true && false && true && true && true && true && true && true && false && true && false) {byte zbehjxco = 115;}else{short qgimjqya = 1645;}

        return bar();
    
}
}