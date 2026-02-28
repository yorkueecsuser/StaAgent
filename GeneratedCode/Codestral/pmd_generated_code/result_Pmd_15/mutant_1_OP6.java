class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        boolean unreachableCondition = false;
        for (int j = 0; unreachableCondition; j++) { // Mutant: Unreachable for loop
            // Unreachable code
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