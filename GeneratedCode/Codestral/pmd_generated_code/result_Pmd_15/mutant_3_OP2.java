class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == 10) {
            return true;
        }
        if (i == 10) { // Mutant code: Duplicated assignment statement
            return false;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}