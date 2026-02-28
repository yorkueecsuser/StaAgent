class BuggyCode {
    public Class<?> showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }
}