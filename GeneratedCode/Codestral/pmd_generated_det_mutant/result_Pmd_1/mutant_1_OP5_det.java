class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        int pfiltirx = 0;switch  (pfiltirx) {case 1:byte nlrqozhv = -87;break;default:double rtpjvdzu = -203877832;break;}
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        return x;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}