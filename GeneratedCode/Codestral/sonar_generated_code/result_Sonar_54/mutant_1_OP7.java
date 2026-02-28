class BuggyCode {
    public void showBug() {
        try {
            boolean condition = getCondition();
            while (condition) { // Added unreachable while loop
                throwAssertionError();
            }
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private boolean getCondition() { // Helper method to return false
        return false;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}