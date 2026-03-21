class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        for  (int qonwwucm = 0; qonwwucm < 0; qonwwucm++) {short gcroelif = 8877;}
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