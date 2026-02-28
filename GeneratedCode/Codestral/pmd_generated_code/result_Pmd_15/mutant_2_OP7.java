class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == 10) {
            // Inserted unreachable while loop mutant
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code will never execute
            }

            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }

    // Helper method to determine the condition of the while loop
    private boolean getCondition() {
        return false;
    }
}