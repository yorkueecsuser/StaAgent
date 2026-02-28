class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // BUG: IsInstanceIncompatibleType
        Object o = obj;
        return o instanceof String; // The variable 'o' is renamed from 'obj'
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}