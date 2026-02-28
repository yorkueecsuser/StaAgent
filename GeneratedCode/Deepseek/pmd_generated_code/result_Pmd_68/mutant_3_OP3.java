class BugReturnFromFinallyBlock {
    public String foo() {
        boolean alwaysFalse = false;
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            if (alwaysFalse) {
                // This is an added mutation that makes the if statement unreachable
                return "This statement is unreachable";
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public String showBug() {
        return foo();
    }
}