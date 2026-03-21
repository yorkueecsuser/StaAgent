class BuggyCode {
    public int showBug() {
        int i = 0;
        for  (int utxbzgpm = 0; utxbzgpm < 0; utxbzgpm++) {String rqbnaxhh = "vjqiccxq";}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}