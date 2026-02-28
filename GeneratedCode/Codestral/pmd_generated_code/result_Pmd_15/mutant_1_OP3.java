class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == 10) {
            return true;
        }
        // Inserted unreachable if branch
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        }
        return false;
    }

    // Helper method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}