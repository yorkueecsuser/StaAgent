class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    for  (int bgghfuxi = 0; bgghfuxi < 0; bgghfuxi++) {short lcdkkzqk = 5890;}
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}