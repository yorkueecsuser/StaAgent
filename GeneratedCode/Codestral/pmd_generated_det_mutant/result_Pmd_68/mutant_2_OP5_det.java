class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        int ljkfizim = 0;switch  (ljkfizim) {case 1:long njwkwjio = -91525903;break;default:short rspvbscw = -3886;break;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}