class IsInstanceIncompatibleTypeBug {
    private boolean getUnreachableCondition() {
        return false; // This method always returns false to make the condition unreachable
    }

    public boolean showBug(Object obj) {
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable");
        }
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}