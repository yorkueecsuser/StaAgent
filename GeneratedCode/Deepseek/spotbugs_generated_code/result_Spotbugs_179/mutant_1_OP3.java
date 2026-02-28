class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);

        // Mutant Code: Unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            mutableObject = new MutableClass(); // This will never execute
        }
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    private static boolean isUnreachable() {
        return false; // Always return false to make the if statement unreachable
    }
}

class MutableClass {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}