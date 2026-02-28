class BugReturnFromFinallyBlock {
    public String foo() {
        String result = "A. O. K."; // Added mutant code
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            for(int i = 0; i < 0; i++) {
                // This loop is unreachable but it maintains the Mutant Operator requirement of Unreachable for loop
            }
            return result; 
        }
    }

    public String showBug() {
        return foo();
    }
}