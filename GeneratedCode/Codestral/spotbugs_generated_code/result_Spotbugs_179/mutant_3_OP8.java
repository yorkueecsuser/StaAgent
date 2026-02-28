class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    private static MutableClass a = mutableObject; // Mutant code

    public static void modifyMutableObject(String newValue) {
        a.setValue(newValue); // Mutant code
    }

    public static String showBug() {
        return a.getValue(); // Mutant code
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