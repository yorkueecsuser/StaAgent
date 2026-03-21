class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            if (false && true && false && true && true && false && false && true && false && true && false) {int uviedktz = -482744625;}else{byte pyywifwn = -123;}
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}