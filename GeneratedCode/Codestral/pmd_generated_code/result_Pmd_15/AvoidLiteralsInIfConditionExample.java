class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final int REQUEST_THRESHOLD = 10;

    public boolean checkRequests(int i) {
        do {
            if (i == REQUEST_THRESHOLD) { // Mutant: Equivalent Loop Replacement and AvoidLiteralsInIfCondition
                return true;
            }
        } while (false); // This do-while loop is equivalent to the original if condition, but it's replaced as per the mutation operator.
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}