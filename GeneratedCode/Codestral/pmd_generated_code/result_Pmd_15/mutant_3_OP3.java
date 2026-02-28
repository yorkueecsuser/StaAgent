class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean getUnreachableCondition() {
        return false;
    }

    public boolean checkRequests(int i) {
        if (i == 10) {
            return true;
        }
        if (getUnreachableCondition()) {
            // This code is unreachable
            throw new IllegalStateException("Unreachable code");
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}