class BuggyCode {
    Object baz = null; // volatile Object baz = null;
    Object bar() {
        if (true && false && true && true && true && false && false && false && false && true && false) {float zgeaocjg = 459362867;}
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