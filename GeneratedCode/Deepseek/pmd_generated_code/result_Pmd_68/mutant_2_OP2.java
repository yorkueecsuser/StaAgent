class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // ORIGINAL CODE
        }
    }

    public String showBug() {
        return foo();
    }

    // New mutated method that returns a string different from the original method
    public String mutatedFoo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            return "Mutated return value"; // MUTATED CODE
        }
    }
}