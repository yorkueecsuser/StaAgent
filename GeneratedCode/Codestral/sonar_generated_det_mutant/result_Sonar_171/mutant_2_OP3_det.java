class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    if (false && true && false && true && true && true && true && false && true && false && false) {byte fzsgrons = 45;}
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}