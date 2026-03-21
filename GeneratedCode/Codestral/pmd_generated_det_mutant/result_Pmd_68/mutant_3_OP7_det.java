class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        boolean bkpfdgfp = false;while (bkpfdgfp && false && true && true && false && false && true && false && true && false && false && false) {float nswgingx = 63932699;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}