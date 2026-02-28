class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            if (isUnreachable()) {
                System.out.println("This line is unreachable");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean isUnreachable() {
        return false; // This method always returns false to make the if statement unreachable
    }
}