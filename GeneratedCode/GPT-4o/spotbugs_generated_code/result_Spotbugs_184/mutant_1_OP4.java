class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String newValue) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never be printed");
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
    
    // Helper method to simulate an unreachable condition
    public boolean getUnreachableCondition() {
        return false;
    }
}