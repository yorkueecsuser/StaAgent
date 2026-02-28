class BuggyCode {
    public String showBug() {
        try {
            boolean condition = getCondition();
            for (int i = 0; condition; i++) {
                // This loop is unreachable because the condition is always false
            }
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean getCondition() {
        return false;
    }
}