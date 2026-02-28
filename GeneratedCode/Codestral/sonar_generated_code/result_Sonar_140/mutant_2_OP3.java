class BuggyCode {
    // Added private method to return false dynamically
    private boolean alwaysFalse() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++;

        // Mutant Unreachable if statement added
        if (alwaysFalse()) {
            System.out.println("Unreachable code executed");
        }

        return j++;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}