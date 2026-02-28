class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // Original code
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutant code: Unreachable switch statement
        int unreachableValue = alwaysFalseValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This should never print.");
                break;
            case 2:
                System.out.println("This should also never print.");
                break;
            default:
                // Default case does not need any code
                break;
        }

        return false;
    }

    private int alwaysFalseValue() {
        // This method always returns a value that is not within the case statements of the switch
        return -1;
    }
}