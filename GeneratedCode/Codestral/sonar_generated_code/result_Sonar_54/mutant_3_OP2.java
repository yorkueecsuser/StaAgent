class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            System.out.println("Expected an AssertionError!"); // Noncompliant
            System.out.println("Expected an AssertionError!"); // Newly added mutant line
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