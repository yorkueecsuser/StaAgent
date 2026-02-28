class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public String showBug() {
        return foo();
    }

    // Mutation to introduce unreachable switch statement
    public void unreachableSwitchStatementMutation() {
        boolean alwaysFalse = false;
        switch (alwaysFalse? 1 : 0) {
            default:
                break;
        }
    }
}