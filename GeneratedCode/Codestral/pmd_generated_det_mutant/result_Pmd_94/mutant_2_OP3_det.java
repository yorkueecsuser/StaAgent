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
if (true && true && true && false && true && false && false && true && true && false && false) {String cegwfezm = "iuhzshqb";}

        return bar();
    
}
}