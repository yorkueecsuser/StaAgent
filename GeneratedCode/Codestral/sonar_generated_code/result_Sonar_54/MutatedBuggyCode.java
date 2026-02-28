class MutatedBuggyCode {
    public void showBug() {
        try {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) { // This branch is unreachable
                throwAssertionError();
            }
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if branch unreachable
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        MutatedBuggyCode mbc = new MutatedBuggyCode();
        mbc.showBug();
    }
}