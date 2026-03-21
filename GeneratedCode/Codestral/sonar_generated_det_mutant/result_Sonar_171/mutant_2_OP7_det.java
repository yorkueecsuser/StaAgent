class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            boolean blkwwkaz = false;while (blkwwkaz && false && false && false && true && true && false && true && false && true && true && false) {int likzjodc = -532660293;}
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}