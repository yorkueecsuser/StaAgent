class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // Mutation: Adding unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // some statement
        }
        // End of mutation
        return Float.compare(max, diff);
    }

    private boolean getCondition() {
        return false;
    }
}