class ToStringBugExample {

    // Incorrectly named method that doesn't override java.lang.Object's toString()
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "This is a custom string representation of the object.";
    }

    public String showBug() {
        ToStringBugExample example = new ToStringBugExample();
        // This will not call the intended toString() method from java.lang.Object
        // Instead, it will use the default Object's toString() which includes hashcode
        return example.toString(); // Intended to call a custom method but defaults to Object's toString
    }

    public static void main(String[] args) {
        ToStringBugExample example = new ToStringBugExample();
        System.out.println("Output from showBug: " + example.showBug());
        System.out.println("Output from custom tostring(): " + example.tostring());

        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable due to the condition always being false
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This is the reachable else block");
        }
    }

    // Method to simulate a condition that always evaluates to false
    public static boolean getUnreachableCondition() {
        return false; // This makes the if condition unreachable
    }
}