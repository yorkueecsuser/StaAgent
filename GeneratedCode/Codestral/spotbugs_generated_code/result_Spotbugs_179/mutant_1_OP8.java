class BuggyClass {
    private static MutableClass v = new MutableClass(); // Mutant code: Renamed'mutableObject' to 'v'

    public static void modifyMutableObject(String newValue) {
        v.setValue(newValue); // Mutant code: Updated the variable name to 'v'
    }

    public static String showBug() {
        return v.getValue(); // Mutant code: Updated the variable name to 'v'
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