class BuggyCode {
    public String showBug() {
        String deadStore; // Dead Store mutation added here
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }
}