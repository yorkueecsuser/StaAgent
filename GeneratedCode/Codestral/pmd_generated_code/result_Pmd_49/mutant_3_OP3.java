class BuggyCode {
    private boolean getFalseCondition() {
        return false;
    }

    public Class<?> showBug() {
        Class<?> c = new String().getClass();

        if (getFalseCondition()) {
            // Unreachable if statement
            System.out.println("This line should not be executed!");
        }

        return c;
    }
}