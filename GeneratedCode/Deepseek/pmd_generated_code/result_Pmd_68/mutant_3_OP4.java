class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K.0"; // Added a condition that always returns false, making this unreachable.
        }
    }

    public String showBug() {
        return foo();
    }
}