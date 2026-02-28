class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == MAX_NUMBER_OF_REQUESTS) {
            return true;
        }
        // Mutant code added
        int dupMaxNumberOfRequests = MAX_NUMBER_OF_REQUESTS;
        if (i == dupMaxNumberOfRequests) {
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}