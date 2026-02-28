class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable branch
            System.out.println("This code should never run.");
        } else {
            // Original code
            return obj instanceof String;
        }
    }

    private boolean getCondition() {
        // A function to return a false condition
        return false;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}