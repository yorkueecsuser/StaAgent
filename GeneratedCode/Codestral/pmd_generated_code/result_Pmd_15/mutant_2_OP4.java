class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static boolean getUnreachableCondition() { return false; } // helper method for unreachable condition

    public boolean checkRequests(int i) {
        if (i == 10) {
            return true;
        }
        if (getUnreachableCondition()) { // Mutant: Added unreachable if-block
            System.out.println("This should not be printed");
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}