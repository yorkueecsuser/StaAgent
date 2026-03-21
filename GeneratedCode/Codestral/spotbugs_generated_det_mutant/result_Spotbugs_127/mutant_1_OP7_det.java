class BuggyCode {
    public int showBug() {
        int i = 0;
        boolean gjraekit = false;while (gjraekit && false && true && true && true && true && true && true && true && false && false && false) {double znqbkgva = -387744302;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}