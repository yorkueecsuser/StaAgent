class IsInstanceIncompatibleTypeBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(Object obj) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable for loop from the Mutation Operator
            System.out.println("This line will never be executed.");
        }

        // Original code
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}