class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == 10) { // Original condition check
            return true;
        }
        if (i == 10) { // Mutated code: Duplicated condition check
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}