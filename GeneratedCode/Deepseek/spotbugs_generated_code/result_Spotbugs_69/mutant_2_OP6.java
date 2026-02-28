class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean unreachableCondition = getUnreachableCondition(); // Added for the mutation
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            System.out.println("This line will never be printed.");
        }
        if (sb!= null) { // Original bug
            return sb.toString();
        }
        return null;
    }

    // Added method for the mutation
    private boolean getUnreachableCondition() {
        return false; // Always false to make the loop unreachable
    }
}