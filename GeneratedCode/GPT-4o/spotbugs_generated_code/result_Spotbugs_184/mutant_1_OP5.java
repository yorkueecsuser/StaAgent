class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String newValue) {
        sharedResource = newValue; // Modifying the static field

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // This method will prevent compile-time constant
        switch (unreachableValue) {
            case 9999: // This case will never be hit
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("Default case, also unreachable.");
                break;
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

    // Helper method to ensure switch statement is unreachable
    public int getUnreachableValue() {
        return -1; // Ensures that no case is matched in the switch
    }
}