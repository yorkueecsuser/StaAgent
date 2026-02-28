class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
            if (getFalseCondition()) {
                // This branch is unreachable
                System.out.println("This line should never execute.");
            } else {
                // This branch is unreachable as well
                System.out.println("This line should also never execute.");
            }
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}