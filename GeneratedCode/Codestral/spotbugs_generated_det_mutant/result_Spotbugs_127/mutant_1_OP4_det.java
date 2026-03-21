class BuggyCode {
    public int showBug() {
        int i = 0;
        if (true && false && false && false && true && true && false && true && true && false && false) {char ylzrxpvb = 'p';}else{boolean luwyrari = true;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}