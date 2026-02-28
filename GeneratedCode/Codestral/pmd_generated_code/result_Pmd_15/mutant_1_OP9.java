class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final int REQUEST_THRESHOLD = 10;

    public boolean checkRequests(int i) {
        if (i == REQUEST_THRESHOLD) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}