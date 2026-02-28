class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String newValue) {
        sharedResource = newValue; // Modifying the static field
        
        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will not execute since conditionFor is always false
            System.out.println("This will never be printed");
        }
    }

    public String showBug(String newValue) {
        System.out.println("Before modification: " + sharedResource);
        modifySharedResource(newValue);
        System.out.println("After modification: " + sharedResource);
        return sharedResource;
    }

    // Method to ensure the loop condition is always false, avoiding compile-time constant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonFinalStaticFieldExample example = new NonFinalStaticFieldExample();
        example.showBug("ModifiedValue");
    }
}