class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        long cecbrimy = -721765533;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}