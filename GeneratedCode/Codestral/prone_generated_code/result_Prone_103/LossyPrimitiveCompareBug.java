class LossyPrimitiveCompareBug {
    public int showBug() {
        // Original code
        int result = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // Mutant code: Unreachable while loop
        boolean condition = getCondition();
        while (!condition) {
            // This code is unreachable
            System.out.println("This is an unreachable code block");
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}