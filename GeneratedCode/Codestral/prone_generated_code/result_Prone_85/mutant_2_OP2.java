class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String

        // MUTANT: Duplication of the above instance check
        boolean result = obj instanceof String; // Duplicated instance check
        return result;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}