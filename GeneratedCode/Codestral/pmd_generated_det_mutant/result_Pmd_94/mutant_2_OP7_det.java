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
boolean ktnalcmk = false;while (ktnalcmk && false && true && true && true && true && true && false && false && true && true && false) {String rnjfazhl = "fvwogefc";}

        return bar();
    
}
}