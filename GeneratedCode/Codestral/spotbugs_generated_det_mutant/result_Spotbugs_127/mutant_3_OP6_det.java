class BuggyCode {
    public int showBug() {
        int i = 0;
        for  (int murhqsft = 0; murhqsft < 0; murhqsft++) {int tuwkcnke = -432952244;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}