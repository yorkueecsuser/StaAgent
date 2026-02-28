class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final boolean ALWAYS_FALSE = false; // Added to avoid direct use of false

    public boolean checkRequests(int i) {
        if (i == 10) {
            return true;
        }
        if (ALWAYS_FALSE) { // Mutation: Unreachable if statement
            throw new AssertionError("This code should never be executed");
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}