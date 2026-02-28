class AvoidLiteralsInIfConditionExample {
    private static final int maxReqs = 10; // Mutation: Renaming

    public boolean checkRequests(int i) {
        if (i == maxReqs) { // Mutated condition
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}