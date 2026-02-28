class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // Maintaining the original bug

    public static void modifyMutableObject(String newValue) {
        int unreachableValue = getUnreachableValue(); // Using a method call to ensure dynamic value

        switch (unreachableValue) {
            case 1:
                mutableObject.setValue(newValue); // Maintaining the original code
                break;
        }
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    private static int getUnreachableValue() {
        return 0; // This value is always unreachable in the switch statement
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