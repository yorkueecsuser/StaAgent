class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        boolean condition = false;  // Mutant: Added a boolean variable which is always false
        while (condition) {  // Mutant: Added unreachable while loop
            /* Unreachable code */
        }

        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}