class BuggyClass {
    private static MutableClass mutableObject = new MutableClass();

    public static void modifyMutableObject(String newValue) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            MutableClass tempObject = new MutableClass();
            tempObject.setValue(newValue);
        } else {
            mutableObject.setValue(newValue);
        }
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