class BuggyCode {
    private boolean getCondition() {
        return false; // This method always returns false, making the branch unreachable
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: i is still zero

        // Unreachable if-else branch mutant
        if (getCondition()) {
            System.out.println("This line is unreachable");
        } else {
            j++;
        }

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}