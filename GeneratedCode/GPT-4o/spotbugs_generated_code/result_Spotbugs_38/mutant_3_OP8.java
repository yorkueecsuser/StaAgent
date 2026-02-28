class ToStringBugExample {

    // Incorrectly named method that doesn't override java.lang.Object's toString()
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "This is a custom string representation of the object.";
    }

    public String showBug() {
        ToStringBugExample a = new ToStringBugExample(); // Renamed variable 'example' to 'a'
        // This will not call the intended toString() method from java.lang.Object
        // Instead, it will use the default Object's toString() which includes hashcode
        return a.toString(); // Intended to call a custom method but defaults to Object's toString
    }

    public static void main(String[] args) {
        ToStringBugExample b = new ToStringBugExample(); // Renamed variable 'example' to 'b'
        System.out.println("Output from showBug: " + b.showBug());
        System.out.println("Output from custom tostring(): " + b.tostring());
    }
}