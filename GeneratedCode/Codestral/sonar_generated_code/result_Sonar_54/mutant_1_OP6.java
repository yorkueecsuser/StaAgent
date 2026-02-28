class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            // Mutant: Unreachable for loop
            boolean condition = getCondition();
            for (int i = 0; condition; i++) {
                // Unreachable code
            }
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}