class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } fally {
            return "A. O. K."; // MUTANT: Renaming
        }
    }

    public String showBug() {
        return foo();
    }
}