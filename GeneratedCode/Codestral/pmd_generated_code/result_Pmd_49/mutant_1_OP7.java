class BuggyCode {
    public Class<?> showBug() {
        boolean condition = getCondition();
        while (condition) {
            // unreachable code
            System.out.println("This is an unreachable loop.");
        }
        Class<?> c = new String().getClass(); // original code
        return c;
    }

    private boolean getCondition() {
        return false; // always return false to make the loop unreachable
    }
}