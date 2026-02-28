class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final int x = 10;  // Mutant: Renamed the literal '10' to 'x'

    public boolean checkRequests(int i) {
        if (i == 10) {
            return true;
        }
        if (i == x) {  // Mutant: Added a new if condition with the renamed variable 'x'
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}