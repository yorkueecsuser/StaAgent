class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        // Mutant code added - unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This block of code is unreachable.");
        }
    }
}