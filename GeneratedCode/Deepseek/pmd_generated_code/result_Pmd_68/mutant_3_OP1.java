class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            String aaabbbcc = "useless variable"; // Mutation: Dead Store
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public String showBug() {
        return foo();
    }
}