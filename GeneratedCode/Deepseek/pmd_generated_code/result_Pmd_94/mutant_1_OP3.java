class BuggyCode {
    Object baz = null; // volatile Object baz = null;
    Object bar() {
        if (baz!= null) { 
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