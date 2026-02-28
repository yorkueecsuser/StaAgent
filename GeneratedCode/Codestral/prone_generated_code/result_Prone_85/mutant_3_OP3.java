class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // BUG: IsInstanceIncompatibleType
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This branch is unreachable, adding it to introduce an unreachable if statement mutant
            throw new IllegalStateException("Unreachable branch executed");
        }
        return obj instanceof String;
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is always false, making the if branch unreachable
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}