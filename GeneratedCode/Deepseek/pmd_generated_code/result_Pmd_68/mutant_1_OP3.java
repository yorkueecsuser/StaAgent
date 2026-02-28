class BugReturnFromFinallyBlock {
    private boolean mutantCondition = true;

    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            if (mutantCondition) {
                return "A. O. K."; // Unreachable if statement mutation
            }
            return "Mutated code";
        }
    }

    public String showBug() {
        return foo();
    }
}