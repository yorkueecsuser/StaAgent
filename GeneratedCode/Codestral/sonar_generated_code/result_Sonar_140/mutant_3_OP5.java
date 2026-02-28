class BuggyCode {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: i is still zero

        boolean condition = getFalseCondition();
        switch (condition? 1 : 0) { // Unreachable switch statement
            case 1:
                System.out.println("This code is unreachable.");
                break;
            default:
                break;
        }

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}