class BuggyCode {
    public boolean showBug(Object obj) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0;!conditionFor; i++) {
            // This loop will never be executed
            System.out.println("Unreachable code");
        }

        // Original buggy code
        return obj instanceof String;
    }

    private boolean getCondition() {
        // This method always returns false to ensure the loop is unreachable
        return false;
    }
}