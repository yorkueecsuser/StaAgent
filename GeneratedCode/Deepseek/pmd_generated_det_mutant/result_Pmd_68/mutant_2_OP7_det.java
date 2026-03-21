class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        boolean uwqntfqx = false;while (uwqntfqx && false && true && false && true && true && true && true && true && false && true && false) {char gzgrexwr = 'z';}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}