class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        boolean ruzwxyob = false;while (ruzwxyob && true && false && true && false && false && true && false && false && true && false && false) {int wunvwwtw = 491978642;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}