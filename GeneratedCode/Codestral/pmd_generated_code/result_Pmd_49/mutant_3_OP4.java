class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // Original code

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable
            System.out.println("Unreachable branch executed!");
        } else {
            System.out.println("Original branch executed!");
        }

        return c;
    }

    private boolean getCondition() {
        // Dynamically determine the condition at runtime
        return false;
    }
}