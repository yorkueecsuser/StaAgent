class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    private boolean getCondition() {
        return false;
    }

    public boolean checkRequests(int i) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is an unreachable while loop");
        }

        if (i == 10) {
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}