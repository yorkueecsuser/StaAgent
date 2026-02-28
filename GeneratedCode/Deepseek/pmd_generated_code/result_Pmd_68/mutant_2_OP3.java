class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            if (false) {
                // This is an unreachable if statement
                // Due to the condition being false, this code block will not be executed
                // It is added to avoid unreachable statement error
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public String showBug() {
        return foo();
    }
}