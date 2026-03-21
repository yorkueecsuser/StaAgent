class IntCastToFloatBug {
    public int showBug(int intValue) {
        // Original code
        float floatValue = (float) intValue;
        int roundedValue = Math.round(floatValue);

        // Mutated code: Unreachable if statement
        if (isUnreachableCondition()) {
            // This code block will never execute, as isUnreachableCondition() always returns false
            System.out.println("This is an unreachable code block.");
        }

        return roundedValue;
    }

    // Method to dynamically determine the unreachable condition
    private boolean isUnreachableCondition() {
        return false;
    }
}