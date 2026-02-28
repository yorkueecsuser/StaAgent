class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Original line
        i = i++; // Mutant: Duplicated line

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}