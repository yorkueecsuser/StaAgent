class PrimitiveWrapperBug {

    // Method to demonstrate the bug
    public Float showBug(Boolean condition) {
        Integer intValue = 100;
        Float floatValue = 100.5f;

        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        return condition? intValue : floatValue;
    }

    public static void main(String[] args) {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        System.out.println(bugDemo.showBug(true));  // Expected: 100.0
        System.out.println(bugDemo.showBug(false)); // Expected: 100.5
    }
}