class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // Inserted unreachable while loop
        while (getCondition()) {
            // This code will never execute
        }

        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}