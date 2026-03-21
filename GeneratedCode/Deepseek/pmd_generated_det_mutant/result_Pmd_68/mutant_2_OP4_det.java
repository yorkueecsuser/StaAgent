class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        if (true && true && true && false && false && true && false && true && true && true && false) {String gcvlhgzp = "erdmowxx";}else{byte xfivqzqh = 64;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}