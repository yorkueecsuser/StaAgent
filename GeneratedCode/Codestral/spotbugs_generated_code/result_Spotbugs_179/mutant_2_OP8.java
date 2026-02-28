class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    private static MutableClass r = new MutableClass(); // Mutant: Renaming with 'r'

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
        r.setValue(newValue); // Mutant: using the renamed variable
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    public static String showMutant() {
        return r.getValue(); // Mutant: added a new method to show the value of the renamed variable
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