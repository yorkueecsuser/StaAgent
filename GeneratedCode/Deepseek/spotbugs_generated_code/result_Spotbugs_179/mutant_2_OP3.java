class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void modifyMutableObject(String newValue) {
        if (isFalse()) {
            // This block of code is unreachable
            System.out.println("Unreachable code block.");
        }
        mutableObject.setValue(newValue);
    }

    private static boolean isFalse() {
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