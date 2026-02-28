class BuggyCode {
    Object baz = null; 
    Object bar() {
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable loop.");
        }
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
}