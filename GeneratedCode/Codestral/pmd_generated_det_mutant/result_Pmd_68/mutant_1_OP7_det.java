class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        boolean upzohonz = false;while (upzohonz && false && false && false && false && false && false && false && false && true && false && false) {char cudlylih = 'b';}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}