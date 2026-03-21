class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            if (false && false && true && false && false && false && false && false && false && false && false) {String wlrrfwgr = "vzqsertb";}
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}