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
boolean ksfvfspm = false;while (ksfvfspm && true && true && false && true && true && true && true && true && false && false && false) {short yljjqwog = 4586;}

        return bar();
    
}
}