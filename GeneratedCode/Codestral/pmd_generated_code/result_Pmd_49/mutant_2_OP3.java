class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass();

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }

        return c;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}