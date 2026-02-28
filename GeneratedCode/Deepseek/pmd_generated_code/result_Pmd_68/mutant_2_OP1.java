class BugReturnFromFinallyBlock {
    public String foo() {
        String deadVariable_123abc = "dead variable"; // DeadStore mutation
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
}