class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        for (int j = 0; getUnreachableCondition(); j++) {
            // This loop is unreachable as getUnreachableCondition() always returns false
        }
        if (i == 10) {
            return true;
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}