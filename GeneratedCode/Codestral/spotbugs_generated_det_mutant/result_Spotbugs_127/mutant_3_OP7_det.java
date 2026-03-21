class BuggyCode {
    public int showBug() {
        int i = 0;
        boolean mpyhgfdw = false;while (mpyhgfdw && true && false && true && false && true && true && false && false && false && true && false) {String hgjblnos = "zipnevsi";}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}