class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        if (getCondition()) {
            // Unreachable branch
            System.out.println("This branch is unreachable!");
        } else {
            // Original code
            return obj instanceof String;
        }
    }

    private boolean getCondition() {
        return false; // Always returns false
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}