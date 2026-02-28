class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // Original code
        return obj instanceof String;

        // Mutant code
        // Duplicating the assignment statement and insert immediately after its current location
        obj = obj instanceof String;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}