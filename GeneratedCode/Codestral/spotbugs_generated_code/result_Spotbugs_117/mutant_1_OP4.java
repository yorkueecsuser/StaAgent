class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        int roundedValue = Math.round(floatValue); // Bug: float value passed to Math.round

        boolean shouldRun = getCondition(); // Method call to ensure dynamic determination at runtime
        if (shouldRun) {
            System.out.println("This will never run");
        } else {
            System.out.println("This is also unreachable");
        }

        return roundedValue;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else block unreachable
    }
}