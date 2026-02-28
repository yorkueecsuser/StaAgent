class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // Original bug
    private static MutableClass anotherMutableObject = new MutableClass(); // New bug introduced

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
    }

    public static void modifyAnotherMutableObject(String newValue) {
        anotherMutableObject.setValue(newValue);
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    public static String showNewBug() {
        return anotherMutableObject.getValue();
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