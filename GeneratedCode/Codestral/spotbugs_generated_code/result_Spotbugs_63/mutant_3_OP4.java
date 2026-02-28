class NonNullParameterBug {

    private boolean getCondition() { return false; }

    private void processValue(String nonNullValue) {
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        processValue(null);

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition(); // Always false to make the branch unreachable
        if (shouldRun) {
            System.out.println("This code is unreachable");
        } else {
            processValue(null); // The bug is still present in the mutant code
        }
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}