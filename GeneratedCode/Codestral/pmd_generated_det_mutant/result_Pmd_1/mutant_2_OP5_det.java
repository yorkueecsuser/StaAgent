class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        int tqriujbo = 0;switch  (tqriujbo) {case 1:boolean otpwedct = true;break;default:double aetakaay = 333806083;break;}
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