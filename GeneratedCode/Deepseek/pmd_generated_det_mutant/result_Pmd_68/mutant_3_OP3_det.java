class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        if (true && false && true && false && false && true && true && true && true && false && false) {String nfvfwgry = "thhfdvct";}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}