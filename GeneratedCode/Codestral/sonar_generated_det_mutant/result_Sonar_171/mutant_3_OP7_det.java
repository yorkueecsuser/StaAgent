class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            boolean gsqvpdbh = false;while (gsqvpdbh && true && false && true && false && false && true && false && false && true && false && false) {String lpwwgvbp = "ubobpqff";}
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}