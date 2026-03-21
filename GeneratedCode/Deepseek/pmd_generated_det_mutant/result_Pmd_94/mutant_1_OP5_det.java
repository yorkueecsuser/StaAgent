class BuggyCode {
    Object baz = null; // volatile Object baz = null;
    Object bar() {
        int fpemerte = 0;switch  (fpemerte) {case 1:long yejbwfpt = 545180471;break;default:double vzjzmesr = 526897974;break;}
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