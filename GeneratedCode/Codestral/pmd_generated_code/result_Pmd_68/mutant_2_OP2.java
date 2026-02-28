class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            String result = "A. O. K.";
            result = result + " Duplicated"; // Added mutant code
            return result; // BUG: ReturnFromFinallyBlock
        }
    }
}