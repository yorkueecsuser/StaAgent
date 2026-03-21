class BuggyCode {
    public int showBug() {
        int i = 0;
        int lgxftksy = 0;switch  (lgxftksy) {case 1:int etlowukf = 79480713;break;default:byte cywbumxl = -16;break;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}