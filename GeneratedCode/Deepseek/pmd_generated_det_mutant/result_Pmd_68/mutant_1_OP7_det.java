class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        boolean zidzdyqp = false;while (zidzdyqp && false && true && true && true && true && false && false && false && true && true && false) {char ltaxokbf = 'x';}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}