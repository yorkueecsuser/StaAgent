class BugReturnFromFinallyBlock {
    public String foo() {
        String mutantVariable = "Mutant"; // Dead Store Mutation.
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