class BuggyCode {
    public void showBug() {
        boolean unreachableCondition = false;
        try {
            throwAssertionError();
            // Mutant injected here
            for (int i = 0; unreachableCondition; i++) {
                System.out.println("Unreachable code executed!");
            }
            System.out.println("Expected an AssertionError!"); // Noncompliant, the AssertionError will be caught and the bug will not be demonstrated.
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}