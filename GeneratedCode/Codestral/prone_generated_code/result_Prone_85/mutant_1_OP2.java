class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        boolean result = obj instanceof String;
        // Mutant Code: Duplication of the assignment statement
        boolean duplicatedResult = obj instanceof String;
        return result;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}