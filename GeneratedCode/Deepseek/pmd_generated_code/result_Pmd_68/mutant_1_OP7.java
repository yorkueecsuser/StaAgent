class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            boolean condition = getCondition();
            while (condition) {
                // Empty loop body to avoid unreachable statement error
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public String showBug() {
        return foo();
    }

    // Added method to avoid compile-time constants directly in conditions
    private boolean getCondition() {
        return false;
    }
}