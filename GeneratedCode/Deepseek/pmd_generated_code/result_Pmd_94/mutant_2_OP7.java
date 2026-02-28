class BuggyCode {
    Object baz = null; 
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
        return bar();
    }

    // Unreachable while loop mutant
    void mutant() {
        while (false) {
            synchronized(this) {
                baz = new Object();
            }
        }
    }
}