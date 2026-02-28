class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        boolean condition = getCondition();
        for (int k = 0; condition; k++) {
            // Unreachable loop added
        }

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    private boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}