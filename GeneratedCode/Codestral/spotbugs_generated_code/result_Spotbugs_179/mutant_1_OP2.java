class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // original bug
    private static MutableClass copiedMutableObject = mutableObject; // mutated code

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
        copiedMutableObject.setValue(newValue); // duplicated line
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