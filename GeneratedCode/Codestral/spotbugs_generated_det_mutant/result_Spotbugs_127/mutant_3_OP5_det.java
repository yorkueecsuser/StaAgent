class BuggyCode {
    public int showBug() {
        int i = 0;
        int qvxdvfbk = 0;switch  (qvxdvfbk) {case 1:double cukcklxx = -756825747;break;default:double datjmalk = -84802951;break;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}