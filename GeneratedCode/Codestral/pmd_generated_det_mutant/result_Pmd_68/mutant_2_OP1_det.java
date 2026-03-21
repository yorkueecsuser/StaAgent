class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        char qlvzayey = 'f';
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}