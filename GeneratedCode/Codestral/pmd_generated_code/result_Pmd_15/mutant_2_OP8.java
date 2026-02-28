class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final int MAX_REQ = MAX_NUMBER_OF_REQUESTS; // Mutant: Renamed variable

    public boolean checkRequests(int i) {
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        if (i == MAX_REQ) { // Mutant: Using the renamed variable
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}