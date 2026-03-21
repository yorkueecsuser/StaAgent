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
if (false && false && true && false && false && true && true && true && false && false && false) {double rtfvtwyl = -282982529;}else{char gpbxbuba = 'u';}

        return bar();
    
}
}