class BuggyCode {
    public int showBug() {
        int i = 0;
        int qgwogtxp = 0;switch  (qgwogtxp) {case 1:double ejpmwepu = -970705586;break;default:boolean hkpveuxh = false;break;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}