class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
        // Mutation: Unreachable for loop
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable
            System.out.println("This line should never execute.");
        }
    }

    private static boolean getUnreachableCondition() {
        return false;
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