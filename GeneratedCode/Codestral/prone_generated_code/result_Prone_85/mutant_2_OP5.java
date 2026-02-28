class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // BUG: IsInstanceIncompatibleType
        boolean isString = obj instanceof String;
        int value = isString? 1 : 0; // dynamically determine the switch value
        switch (value) {
            case 2: // unreachable case
                System.out.println("Unreachable code");
                break;
        }
        return isString; // This will always evaluate to false because obj is of type Object, not String
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}