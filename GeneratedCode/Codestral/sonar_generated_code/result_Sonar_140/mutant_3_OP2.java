class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: i is still zero
        i = i++; // Mutant: Duplicating the assignment statement

        return j++; // Bug: 0 returned
        j = j++; // Mutant: Duplicating the assignment statement

        // Note: In the original code, the second 'j++' will not have any effect as it's used in a return statement.
        // To avoid unreachable statement error, I've changed it to a simple assignment.
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}