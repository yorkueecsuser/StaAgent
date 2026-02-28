class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        Object renamedObj = obj; // Added a new variable with a renamed name
        return renamedObj instanceof String; // Using the renamed variable in the buggy line
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Still prints false
    }
}