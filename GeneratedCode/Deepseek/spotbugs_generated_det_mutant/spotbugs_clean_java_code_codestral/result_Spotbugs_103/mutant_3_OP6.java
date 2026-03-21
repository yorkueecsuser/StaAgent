class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        boolean loopCondition = false;

        // Mutation: Unreachable for loop
        for (int i = 0; loopCondition; i++) {
            System.out.println("This loop is unreachable");
        }

        if (obj instanceof String) {
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    // Helper method to return a dynamic loop condition
    private boolean getCondition() {
        return false;
    }
}