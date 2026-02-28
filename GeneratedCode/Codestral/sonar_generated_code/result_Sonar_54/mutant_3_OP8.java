class BuggyCode {
    public void showBug() {
        try {
            a();
            System.out.println("Expected an AssertionError!"); // Noncompliant, the AssertionError will be caught and the bug will not be demonstrated.
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private void a() { // Mutated method name
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}