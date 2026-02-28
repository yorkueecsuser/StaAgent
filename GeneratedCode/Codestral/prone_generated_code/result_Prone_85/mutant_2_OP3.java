class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false

        // Mutant: Unreachable if statement
        boolean unreachableCondition = bug.getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line will never be executed");
        }
    }
}