class BuggyCode {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Class<?> showBug() {
        Class<?> c = new String().getClass();

        if (getUnreachableCondition()) {
            // Unreachable branch
            System.out.println("This is an unreachable part of the code.");
        } else {
            // Original branch
            return c;
        }
    }
}