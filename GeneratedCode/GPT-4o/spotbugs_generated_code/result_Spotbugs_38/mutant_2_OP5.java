class ToStringBugExample {

    // Incorrectly named method that doesn't override java.lang.Object's toString()
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "This is a custom string representation of the object.";
    }

    public String showBug() {
        ToStringBugExample example = new ToStringBugExample();
        // This will not call the intended toString() method from java.lang.Object
        // Instead, it will use the default Object's toString() which includes hashcode
        int value = getUnreachableValue(); // This ensures the switch remains unreachable
        switch (value) {
            case 1:
                return "Unreachable code";
            default:
                break;
        }
        return example.toString(); // Intended to call a custom method but defaults to Object's toString
    }

    private int getUnreachableValue() {
        return 0; // This value will never match the case in the switch statement
    }

    public static void main(String[] args) {
        ToStringBugExample example = new ToStringBugExample();
        System.out.println("Output from showBug: " + example.showBug());
        System.out.println("Output from custom tostring(): " + example.tostring());
    }
}