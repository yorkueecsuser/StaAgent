class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        int result = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // Mutation: Unreachable while loop
        while (getUnreachableCondition()) {
            // This code is unreachable and will not be executed
        }

        return result;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, ensuring the loop is unreachable
        return false;
    }
}