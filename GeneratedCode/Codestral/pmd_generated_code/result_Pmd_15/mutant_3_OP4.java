class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == MAX_NUMBER_OF_REQUESTS) {
            return true;
        } else if (getUnreachableCondition()) { // Mutant: Unreachable if-else branch
            // This branch is unreachable because getUnreachableCondition() always returns false
            System.out.println("Unreachable branch executed.");
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}