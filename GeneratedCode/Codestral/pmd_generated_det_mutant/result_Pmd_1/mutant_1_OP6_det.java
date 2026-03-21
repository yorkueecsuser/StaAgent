class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        for  (int aobvnwwy = 0; aobvnwwy < 0; aobvnwwy++) {long chfcqvfi = 71382627;}
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