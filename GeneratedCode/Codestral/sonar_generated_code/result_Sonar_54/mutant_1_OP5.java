class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        boolean condition = false;
        switch (condition? 1 : 0) { // This switch statement is unreachable because `condition` is always false
            case 1:
                throw new IllegalStateException("Unreachable code");
                break;
            default:
                break;
        }

        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}