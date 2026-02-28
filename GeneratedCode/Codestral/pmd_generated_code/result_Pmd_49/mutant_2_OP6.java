class BuggyCode {
    public Class<?> showBug() {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Inserted unreachable for loop
            // This loop will never be executed because the condition is always false
        }
        Class<?> c = new String().getClass(); // Original code
        return c;
    }
}