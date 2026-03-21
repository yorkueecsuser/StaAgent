class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        boolean pltxjjuj = false;while (pltxjjuj && true && true && false && true && true && true && true && true && true && false && false) {byte pmaoqmnp = 93;}
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