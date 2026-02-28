class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            while (false) {
                // An unreachable while loop
            }
            return "A. O. K."; // The original code
        }
    }

    public String showBug() {
        return foo();
    }
}