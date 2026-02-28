class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // Original bug: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void modifyMutableObject(String newValue) {
        while (isUnreachableCondition()) { // Mutated code: Insert unreachable while loop
            // This loop will never be executed
        }
        mutableObject.setValue(newValue);
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    private static boolean isUnreachableCondition() {
        return false; // Always returns false, making the loop unreachable
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