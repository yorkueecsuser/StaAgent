class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;
        int xyzabcde = 10; // Mutant: Dead Store

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}