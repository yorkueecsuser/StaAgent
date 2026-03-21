class BuggyCode {
    Object baz = null; // volatile Object baz = null;
    Object bar() {
        if (true && true && false && true && false && true && false && true && false && false && false) {long faldusdf = -947753314;}
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