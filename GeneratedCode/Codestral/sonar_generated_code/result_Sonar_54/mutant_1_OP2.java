class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            throwAssertionError(); // Mutant: Duplicated the assertion error creation
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