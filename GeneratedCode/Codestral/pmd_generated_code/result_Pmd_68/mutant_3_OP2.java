class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K.";
            // Mutant code: Duplicate the return statement
            return "A. O. K.";
        }
    }
}