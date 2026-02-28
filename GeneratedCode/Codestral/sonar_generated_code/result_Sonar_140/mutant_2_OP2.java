class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: i is still zero
        i = i++; // Mutant: Duplicating the assignment statement

        return j++; // Bug: 0 returned
        return j++; // Mutant: Duplicating the return statement
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}