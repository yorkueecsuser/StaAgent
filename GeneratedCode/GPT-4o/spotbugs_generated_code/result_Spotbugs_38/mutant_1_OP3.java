class ToStringBugExample {

    // Incorrectly named method that doesn't override java.lang.Object's toString()
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "This is a custom string representation of the object.";
    }

    public String showBug() {
        ToStringBugExample example = new ToStringBugExample();
        // This will not call the intended toString() method from java.lang.Object
        // Instead, it will use the default Object's toString() which includes hashcode
        boolean condition = getFalseCondition(); // Non-final variable to simulate unreachable code
        if (condition) { // This branch is unreachable as condition is always false
            System.out.println("This code is never executed.");
        }
        return example.toString(); // Intended to call a custom method but defaults to Object's toString
    }

    private boolean getFalseCondition() {
        return false; // Always returns false
    }

    public static void main(String[] args) {
        ToStringBugExample example = new ToStringBugExample();
        System.out.println("Output from showBug: " + example.showBug());
        System.out.println("Output from custom tostring(): " + example.tostring());
    }
}