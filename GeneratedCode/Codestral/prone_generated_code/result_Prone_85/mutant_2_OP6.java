class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // Original code
        boolean originalCheck = obj instanceof String;

        // Mutant: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("This line should never be executed");
        }

        return originalCheck;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}