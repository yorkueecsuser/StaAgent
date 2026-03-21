class BuggyCode {
    public int showBug() {
        int i = 0;
        for  (int zthhdavc = 0; zthhdavc < 0; zthhdavc++) {int kntrwzct = -136907825;}
        i = i++; // Bug: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug()); // Should always print 0
    }
}