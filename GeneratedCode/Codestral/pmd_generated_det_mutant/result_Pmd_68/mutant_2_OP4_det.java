class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        if (false && false && true && false && true && false && false && false && true && true && false) {short dxmcnczl = -6744;}else{byte wfcrcetw = -121;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}