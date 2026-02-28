class BuggyCode {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        while (getFalseCondition()) {
            // Unreachable code
            int a = 10;
        }

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}