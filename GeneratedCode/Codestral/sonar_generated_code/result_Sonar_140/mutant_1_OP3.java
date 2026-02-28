class BuggyCode {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This line should never be executed");
        }

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}