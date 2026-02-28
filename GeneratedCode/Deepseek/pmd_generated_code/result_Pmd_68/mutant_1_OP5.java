class BugReturnFromFinallyBlock {
    public String foo() {
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
    public void mutant() {
        int x = 0;
        switch (x) {
            case 1:
                // This is a mutant
                break;
            default:
                // This is a mutant
                break;
        }
    }
}