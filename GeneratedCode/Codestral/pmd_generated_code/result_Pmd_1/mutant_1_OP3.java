class BuggyCode {
    public int getX() {
        return 3;
    }

    // Mutant: Unreachable if statement
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int x = 2;
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        // Added unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This statement is unreachable!");
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}