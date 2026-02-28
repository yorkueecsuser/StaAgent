class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable mutant branch
            int result = (int) floatValue;
            System.out.println("This line should not be executed");
            return result;
        } else {
            return Math.round(floatValue); // Original bug still exists
        }
    }

    public boolean getCondition() {
        // This method is added to ensure dynamic determination of the condition
        return false;
    }
}