class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            if (getCondition()) {
                System.out.println("This line will never be executed!");
            }
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private boolean getCondition() {
        return false; // The condition is always false to make the if branch unreachable
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}