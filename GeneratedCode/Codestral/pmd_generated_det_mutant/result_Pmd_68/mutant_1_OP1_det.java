class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        boolean jfdccsrs = false;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}