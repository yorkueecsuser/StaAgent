class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // BUG: IsInstanceIncompatibleType
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
            System.out.println("This loop is unreachable");
        }
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    }

    public static boolean getCondition() {
        // This method returns a compile-time constant (false) to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}