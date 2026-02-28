class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        // Adding a mutant
        for (int j = 0; getUnreachableCondition(); j++) {
            System.out.println("This is an unreachable loop.");
        }

        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}