class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');

        // Unreachable for loop mutation
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This line should never be executed.");
        }

        return sb.capacity();
    }

    // Helper method to return the condition
    private boolean getCondition() {
        return false;
    }
}