class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        Object objectRenamed = obj; // Renaming mutant
        // BUG: IsInstanceIncompatibleType
        return objectRenamed instanceof String; // This will always evaluate to false because objectRenamed is of type Object, not String
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}