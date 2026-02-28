class BuggyCode {
    public String showBug() {
        String abcddefg; // Dead store mutant
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }
}