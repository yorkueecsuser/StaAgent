class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        int billlfzk = 0;switch  (billlfzk) {case 1:byte itzqyqho = -62;break;default:char dbarxfnm = 'z';break;}
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    
}
}