class BuggyCode {
    // Unreachable while loop Mutant
    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        // Insert unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
            System.out.println("Unreachable code executed");
        }

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}