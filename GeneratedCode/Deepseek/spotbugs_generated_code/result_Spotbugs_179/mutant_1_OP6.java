class BuggyClass {
    private static MutableClass mutableObject = new MutableClass();

    public static void modifyMutableObject(String newValue) {
        boolean condition = getCondition(); // Added this line to avoid using 'false' directly
        for (int i = 0; condition; i++) { // Inserted unreachable for loop
            // This loop will never execute
        }
        mutableObject.setValue(newValue);
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    private static boolean getCondition() { // Added this method to dynamically determine the condition
        return false;
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