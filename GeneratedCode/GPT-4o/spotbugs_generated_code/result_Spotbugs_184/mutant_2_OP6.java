class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String newValue) {
        sharedResource = newValue; // Modifying the static field

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code");
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

    // Method to provide a condition for the loop
    private boolean getCondition() {
        return false;
    }
}