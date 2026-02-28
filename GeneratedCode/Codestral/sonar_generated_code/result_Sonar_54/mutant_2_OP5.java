class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("This will never be printed!");
                    break;
            }
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}