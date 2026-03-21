class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        if (true && false && true && false && false && true && true && false && true && true && false) {long npjgmoop = 914727924;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}