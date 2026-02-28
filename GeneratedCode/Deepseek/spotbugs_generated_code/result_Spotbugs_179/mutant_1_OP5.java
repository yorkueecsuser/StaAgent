class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // Original bug is retained

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);

        // Mutated section: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never execute!");
                break;
        }
    }

    public static String showBug() {
        return mutableObject.getValue();
    }

    private static int getUnreachableValue() {
        return -1;
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