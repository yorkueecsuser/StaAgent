class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            System.out.println("Expected an AssertionError!"); // Noncompliant
            System.out.println("Expected an AssertionError!"); // Additional statement due to duplication mutation
        } catch (AssertionError e) {
            System.out.println("Caught an AssertionError!"); // Newly added line due to duplication mutation
        }
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}