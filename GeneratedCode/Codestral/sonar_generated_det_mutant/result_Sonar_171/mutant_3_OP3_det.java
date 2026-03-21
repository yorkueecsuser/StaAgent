class BuggyClass {
    public int showBug() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) { // Assume 'q' is 5 for demonstration
                    break; // Noncompliant - prevents the RuntimeException from being propagated
                }
            if (true && false && true && true && false && true && false && false && false && true && false) {int gbyjsoon = 31898398;}
            }
            return 0; // This return statement suppresses the RuntimeException
        }
    
}
}