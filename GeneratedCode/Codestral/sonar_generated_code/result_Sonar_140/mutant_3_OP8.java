class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        int k = i++; // Mutant: renamed variable 'i' to 'k'

        return j++;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}