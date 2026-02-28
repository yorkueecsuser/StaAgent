class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        if (getUnreachableCondition()) { // Mutant code added
            System.out.println("This line should never execute");
        } else {
            // Original code continues
        }
        return c;
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the condition unreachable
    }
}