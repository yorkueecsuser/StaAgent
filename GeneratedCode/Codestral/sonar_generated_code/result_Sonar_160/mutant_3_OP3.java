class IdenticalExpressionsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int a, int b) {
        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            return true;
        }

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This block of code will never be executed
            System.out.println("This is an unreachable if statement.");
        }

        return false;
    }
}