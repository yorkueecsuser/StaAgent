class BuggyClass {
    private static MutableClass mutableObject = new MutableClass();

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable, so the code inside it will never execute
            System.out.println("This line should never be printed");
        } else {
            // This is the reachable branch
            System.out.println("This line should always be printed");
        }
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    private static boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if branch unreachable
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