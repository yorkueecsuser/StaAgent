class BuggyCode {
    public int showBug() {
        int i = 0;
        if (true && false && false && false && false && true && false && true && true && true && false) {String nroabblu = "tebieaol";}else{int assxlfeg = 497285350;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}