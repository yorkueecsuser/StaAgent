class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // Original assignment statement
    private static MutableClass duplicateMutableObject = new MutableClass(); // Mutant: Duplicated assignment statement

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
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