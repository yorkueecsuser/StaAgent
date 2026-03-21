class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        boolean bsekxeks = false;while (bsekxeks && true && false && false && true && true && false && true && true && true && false && false) {char zzlvymti = 'h';}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}