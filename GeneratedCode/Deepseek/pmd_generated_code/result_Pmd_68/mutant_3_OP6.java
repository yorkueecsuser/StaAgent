class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            for (int i = 0; false; i++) {
                return "A. O. K.";
            }
        }
    }

    public String showBug() {
        return foo();
    }
}