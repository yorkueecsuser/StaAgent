class BuggyCode {
    public int showBug() {
        int i = 0;
        if (true && true && false && true && false && true && false && false && true && false && false) {int uixnnoqo = -288401473;}else{char wgzhqzxo = 'g';}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}