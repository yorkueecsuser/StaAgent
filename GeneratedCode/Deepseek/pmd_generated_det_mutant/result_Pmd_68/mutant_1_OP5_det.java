class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        int ywayxcij = 0;switch  (ywayxcij) {case 1:short vwdwspmb = -9931;break;default:char gdigaotj = 'q';break;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}

    public String showBug() {
        return foo();
    }
}