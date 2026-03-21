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
if (true && false && true && true && true && true && true && false && true && true && false) {byte ixvimpme = -95;}else{float edtlbdue = -39449427;}

        return bar();
    
}
}