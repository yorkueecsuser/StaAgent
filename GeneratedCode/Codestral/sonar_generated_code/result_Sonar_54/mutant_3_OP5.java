class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            int value = getUnreachableValue(); // Non-final variable or an equivalent method call
            switch(value) {
                case 1:
                    System.out.println("Unreachable code!");
                    break;
            }
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}