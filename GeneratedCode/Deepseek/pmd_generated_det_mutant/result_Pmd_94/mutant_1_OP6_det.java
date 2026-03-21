class BuggyCode {
    Object baz = null; // volatile Object baz = null;
    Object bar() {
        for  (int cwxmfpxe = 0; cwxmfpxe < 0; cwxmfpxe++) {long rfktabnu = -284635878;}
        if (baz == null) { // BUG: DoubleCheckedLocking
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
              }
        }
        return baz;
    
}
    // Add a public method to demonstrate the bug
    public Object showBug() {
        return bar();
    }
}