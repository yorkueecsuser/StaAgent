class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // Original code
        boolean returnValue = obj instanceof String;

        // Mutant code: Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }

        return returnValue;
    }

    public boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}