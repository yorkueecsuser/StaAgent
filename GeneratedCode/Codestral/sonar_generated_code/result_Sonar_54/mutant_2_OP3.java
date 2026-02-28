class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            boolean unreachableCondition = alwaysFalse();
            if (unreachableCondition) {
                System.out.println("This line will never be executed!"); // Unreachable if statement mutant
            }
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}