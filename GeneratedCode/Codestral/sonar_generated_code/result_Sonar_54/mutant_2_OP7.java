class BuggyCode {
    public void showBug() {
        try {
            boolean shouldLoop = getCondition();
            while (shouldLoop) {/* Unreachable while loop */}
            throwAssertionError();
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