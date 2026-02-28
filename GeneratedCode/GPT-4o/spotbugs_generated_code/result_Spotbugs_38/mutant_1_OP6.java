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

        // Unreachable for loop mutation
        boolean runUnreachableLoop = getRunUnreachableLoop();
        for (int i = 0; runUnreachableLoop; i++) {
            // This block will never execute because runUnreachableLoop is false
            System.out.println("This is unreachable code inside the for loop.");
        }
    }

    // Method to provide a dynamic condition for the unreachable loop
    public static boolean getRunUnreachableLoop() {
        return false; // Always returns false to ensure the loop is unreachable
    }
}