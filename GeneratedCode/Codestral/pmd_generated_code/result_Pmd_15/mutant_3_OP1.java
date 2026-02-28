class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        int unusedVar = 5; // BUG: Dead Store
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}