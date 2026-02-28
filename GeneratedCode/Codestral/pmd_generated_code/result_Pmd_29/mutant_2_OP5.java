class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original code
        boolean result = value == Double.NaN;

        // Mutant code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable.");
                break;
            default:
                break;
        }

        return result;
    }

    // This method is added to ensure that the switch statement is unreachable
    private int getUnreachableValue() {
        return -1;
    }
}