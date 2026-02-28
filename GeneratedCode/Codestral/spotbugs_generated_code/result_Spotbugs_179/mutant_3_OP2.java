class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    private static MutableClass duplicateMutableObject = mutableObject; // Mutated code: Duplicated assignment to maintain the original bug

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
        duplicateMutableObject.setValue(newValue); // Mutated code: Duplicated modification to maintain the original bug
    }

    public static String showBug() {
        return mutableObject.getValue();
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