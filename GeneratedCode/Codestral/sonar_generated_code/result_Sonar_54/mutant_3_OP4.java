class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}

        // Mutant code
        if (isUnreachableCondition()) {
            // This block is unreachable
            System.out.println("This is an unreachable block!");
        } else {
            // This block will always be executed
            System.out.println("This is the reachable block!");
        }
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    // Method to return a false condition
    private boolean isUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}