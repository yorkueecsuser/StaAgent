class BuggyCode {
    Object baz = null;
    String rand = "abcdefgh"; // Dead Store Mutation Operator
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
}