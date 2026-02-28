class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // Original code
            return "A. O. K."; // Mutated code
        }
    }

    public String showBug() {
        return foo();
    }
}