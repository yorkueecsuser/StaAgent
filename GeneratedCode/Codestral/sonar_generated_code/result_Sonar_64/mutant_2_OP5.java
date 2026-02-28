class BuggyExceptionCreation {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        if (getFalseCondition()) {
            switch (x) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never be reached");
                    break;
                default:
                    break;
            }
        }
    }
}