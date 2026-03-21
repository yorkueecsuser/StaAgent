class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        if (true && false && true && true && false && true && false && false && true && true && false) {int ejvftykq = 743670021;}else{boolean jbhldopu = true;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}