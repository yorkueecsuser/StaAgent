class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final char DEAD_STORE = 'a'; // Dead Store mutation

    public boolean checkRequests(int i) {
        if (i == MAX_NUMBER_OF_REQUESTS) { // Updated to avoid literal
            DEAD_STORE = 'b'; // Added dead store mutation
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}