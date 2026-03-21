class BuggyCode {
    public int showBug() {
        int i = 0;
        boolean mowtbkid = false;while (mowtbkid && false && false && true && true && true && false && true && true && false && false && false) {int wtlhcnei = -900220278;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}