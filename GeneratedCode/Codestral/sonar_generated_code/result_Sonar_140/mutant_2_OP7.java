class BuggyCode {
    // A method to return always false condition to make the loop unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        // Adding an unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("This loop will never execute");
        }

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}