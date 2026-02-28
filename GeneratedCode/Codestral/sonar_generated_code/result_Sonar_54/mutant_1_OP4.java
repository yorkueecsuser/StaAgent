class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {
            if (unreachableCondition()) {
                // Unreachable if-else statement mutant
                System.out.println("This is an unreachable branch!");
            } else {
                // This else branch is also unreachable.
                System.out.println("This is an unreachable else branch!");
            }
        }
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private boolean unreachableCondition() {
        return false; // Always false to make the if-else branch unreachable.
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}