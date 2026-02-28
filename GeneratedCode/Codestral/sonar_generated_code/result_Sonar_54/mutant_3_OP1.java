class BuggyCode {
    public void showBug() {
        try {
            int deadStore = 10; // Added dead store variable
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
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