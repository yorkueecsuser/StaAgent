class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == 10) { // Original code
            return true;
        }
        if (getUnreachableCondition()) { // Mutant code: Unreachable if-statement
            System.out.println("This line should never be executed.");
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if-statement unreachable
    }
}