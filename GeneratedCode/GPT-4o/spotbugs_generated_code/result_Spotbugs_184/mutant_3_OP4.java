class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String newValue) {
        // Insert an unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This statement is unreachable.");
        } else {
            sharedResource = newValue; // Modifying the static field
        }
    }

    public String showBug(String newValue) {
        System.out.println("Before modification: " + sharedResource);
        modifySharedResource(newValue);
        System.out.println("After modification: " + sharedResource);
        return sharedResource;
    }

    public static void main(String[] args) {
        NonFinalStaticFieldExample example = new NonFinalStaticFieldExample();
        example.showBug("ModifiedValue");
    }

    // Helper method to ensure condition is always false
    private boolean getFalseCondition() {
        return false;
    }
}