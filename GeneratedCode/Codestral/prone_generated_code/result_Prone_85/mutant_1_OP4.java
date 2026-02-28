class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch");
        } else {
            return obj instanceof String;
        }
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}