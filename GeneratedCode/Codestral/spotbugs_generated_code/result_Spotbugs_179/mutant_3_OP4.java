class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // Original bug remains unchanged

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    public static void unreachableMethod() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line is unreachable.");
        } else {
            System.out.println("This is the guaranteed output.");
        }
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