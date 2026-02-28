class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            if (false) {
                return "This code will never be executed";
            } else {
                return "A. O. K."; // Mutation: ReturnFromFinallyBlock
            }
        }
    }

    public String showBug() {
        return foo();
    }
}