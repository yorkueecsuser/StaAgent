class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;
        int k = 0; // Mutant: New variable introduced with a different name

        i = i++; // Bug: i is still zero
        k = i; // Mutant: Value of i is assigned to the new variable k

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}